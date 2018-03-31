package com.epam.autoparking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Parking.
 */
public class Parking extends HttpServlet {
    /**
     * serial Version ID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Logger initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(Parking.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Parking() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doGet(final HttpServletRequest request,
            final HttpServletResponse response)
            throws ServletException, IOException {
        String registrationNum = request.getParameter("regNum");
        if (registrationNum != null) {
            LOGGER.info(registrationNum + " Vehicle Parked..");
        } else {
            LOGGER.error("This is error : " + registrationNum);
        }
        response.getWriter().append("Served at: ")
                .append(request.getContextPath());
    }

}
