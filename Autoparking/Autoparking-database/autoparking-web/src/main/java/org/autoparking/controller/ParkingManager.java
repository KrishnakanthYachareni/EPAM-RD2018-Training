package org.autoparking.controller;

import org.apache.log4j.Logger;
import org.autoparking.model.Vehicle;
import org.autoparking.service.Park;
import org.autoparking.service.Unpark;
import org.autoparking.service.exception.InvalidParkingLotException;
import org.autoparking.service.exception.InvalidRegistrationNumberException;
import org.autoparking.service.validator.RegNumberValidator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParkingManager
 */
public class ParkingManager extends HttpServlet {
    /**
     * default serial version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Logger Initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(ParkingManager.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParkingManager() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String registrationNum = request.getParameter("regnum").toUpperCase();
        String command = request.getParameter("command");
        RegNumberValidator regValidator = new RegNumberValidator();

        PrintWriter out = response.getWriter();
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        try {
            if (regValidator.validate(registrationNum)) {
                try {
                    if (command.equalsIgnoreCase("park")) {
                        Vehicle vehicle = new Vehicle();
                        vehicle.setRegistrationID(registrationNum);
                        if (new Park().park(vehicle)) {
                            dispatcher.include(request, response);
                        }
                        out.println("<center>" + registrationNum + " vehicle Parked</center>");
                    } else {
                        new Unpark().unPark(registrationNum);
                        dispatcher.include(request, response);
                        out.println("<center>" + registrationNum + " vehicle UnParked</center>");
                    }
                } catch (InvalidParkingLotException e) {
                    LOGGER.error(e);
                    try {
                        dispatcher.include(request, response);
                        out.println("<center>" + e.getLocalizedMessage() + "</center>");
                    } catch (IOException e2) {
                        LOGGER.error(e2);
                    }
                }
            }
        } catch (InvalidRegistrationNumberException e1) {
            LOGGER.error(e1);
            try {
                dispatcher.include(request, response);
                out.println("<center>" + e1.getLocalizedMessage() + "</center>");
            } catch (IOException e2) {
                LOGGER.error(e2);
            }
        }

    }
}
