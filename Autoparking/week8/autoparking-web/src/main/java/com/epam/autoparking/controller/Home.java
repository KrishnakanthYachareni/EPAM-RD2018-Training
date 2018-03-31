/**
 * Servlet implementation class Home.
 */
package com.epam.autoparking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.autoparking.api.exception.InvalidParkingLotException;
import org.autoparking.service.exception.InvalidRegistrationNumberException;
import org.autoparking.service.parking.ParkingLotManager;
import org.autoparking.service.validator.RegNumberValidator;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {

    /**
     * default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Logger Initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(Home.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String registrationNum = request.getParameter("regnum").toUpperCase();
        String command = request.getParameter("command");
        ParkingLotManager manager = new ParkingLotManager();
        RegNumberValidator regValidator = new RegNumberValidator();

        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        try {
            if (regValidator.validate(registrationNum)) {
                try {
                    if (command.equalsIgnoreCase("park")) {
                        manager.park(registrationNum);
                        dispatcher.include(request, response);
                        out.println("<center>" + registrationNum + " vehicle Parked</center>");
                    } else {
                        manager.unPark(registrationNum);
                        dispatcher.include(request, response);
                        out.println("<center>" + registrationNum + " vehicle UnParked</center>");
                    }
                } catch (InvalidParkingLotException e) {
                    LOGGER.error(e);
                    try {
                        response.sendRedirect("home.jsp");
                    } catch (IOException e2) {
                        LOGGER.error(e2);
                    }
                }
            }
        } catch (InvalidRegistrationNumberException e1) {
            LOGGER.error(e1);
            try {
                response.sendRedirect("home.jsp");
            } catch (IOException e2) {
                LOGGER.error(e2);
            }
        }
    }

}
