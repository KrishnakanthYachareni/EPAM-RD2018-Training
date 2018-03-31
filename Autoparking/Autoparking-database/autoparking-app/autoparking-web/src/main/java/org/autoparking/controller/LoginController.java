package org.autoparking.controller;

import org.apache.log4j.Logger;
import org.autoparking.dao.user.UserDAOFactory;
import org.autoparking.service.exception.InvalidUserNameException;
import org.autoparking.service.validator.PasswordValidator;
import org.autoparking.service.validator.UserNameValidator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParkingLotController
 */
public class LoginController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        UserNameValidator nameValidator = new UserNameValidator();
        PasswordValidator passValidator = new PasswordValidator();

        PrintWriter out = response.getWriter();
        // validate user details
        try {
            if (nameValidator.validate(userName) && passValidator.validate(password)) {
                if (UserDAOFactory.create().isUserValid(userName, password)) {
                    response.sendRedirect("home.jsp");
                } else {
                    request.getRequestDispatcher("index.jsp").include(request, response);
                    out.print("<center>Invalid User Name and password.</center>");
                }
            }
        } catch (InvalidUserNameException e) {
            LOGGER.error(e);
            request.getRequestDispatcher("index.jsp").include(request, response);
            out.print("<center>userName and Password are not in Valid Format.</center>");
        }
    }


}
