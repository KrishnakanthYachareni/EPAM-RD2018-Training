/**
 * Servlet implementation class RegistrationServlet.
 */
package com.epam.autoparking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.autoparking.service.exception.InvalidCredentialsException;
import org.autoparking.service.exception.InvalidUserNameException;
import org.autoparking.service.parking.UserManager;
import org.autoparking.service.validator.PasswordValidator;
import org.autoparking.service.validator.UserNameValidator;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {

    /**
     * default serial version ID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Logger Initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(RegistrationServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String lotName = request.getParameter("lot");
        UserManager userManager = new UserManager();
        UserNameValidator nameValid = new UserNameValidator();
        PasswordValidator passValid = new PasswordValidator();
        try {
            if (nameValid.validate(username) && passValid.validate(password)
                    && userManager.userSignUp(username, password, lotName)) {
                response.sendRedirect("home.jsp");
            }
        } catch (InvalidCredentialsException e) {
            LOGGER.error(e);
        } catch (InvalidUserNameException e) {
            LOGGER.error(e);
            response.sendRedirect("registration.jsp");
        }
    }

}
