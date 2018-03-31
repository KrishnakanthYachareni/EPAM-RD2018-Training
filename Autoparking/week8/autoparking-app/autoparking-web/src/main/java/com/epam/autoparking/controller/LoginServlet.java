
/**
 * Servlet implementation class Home.
 */package com.epam.autoparking.controller;

import org.apache.log4j.Logger;
import org.autoparking.service.exception.InvalidCredentialsException;
import org.autoparking.service.exception.InvalidUserNameException;
import org.autoparking.service.parking.UserManager;
import org.autoparking.service.validator.PasswordValidator;
import org.autoparking.service.validator.UserNameValidator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
    
    /**
     * default serial version ID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * Logger Initialization.
     */
    private static final Logger LOGGER = Logger.getLogger(LoginServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();
        session.setAttribute("uname", username);

        UserManager userManager = new UserManager();
        UserNameValidator nameValid = new UserNameValidator();
        PasswordValidator passValid = new PasswordValidator();
        try {
            if (nameValid.validate(username) && passValid.validate(password)
                    && userManager.userLogin(username, password)) {
                response.sendRedirect("home.jsp");
            }
        } catch (InvalidCredentialsException | InvalidUserNameException e) {
            LOGGER.error("Invalid Credentials in LoginServlet ", e);
            try {
                response.sendRedirect("index.jsp");
            } catch (Exception e1) {
                LOGGER.error(e);
            }
        }
    }
}
