package org.autoparking.controller;

import org.apache.log4j.Logger;
import org.autoparking.dao.user.UserDAOFactory;
import org.autoparking.model.User;
import org.autoparking.service.exception.InvalidParkingLotException;
import org.autoparking.service.exception.InvalidUserNameException;
import org.autoparking.service.validator.ParkingNameValidator;
import org.autoparking.service.validator.PasswordValidator;
import org.autoparking.service.validator.UserNameValidator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInController
 */
public class SignInController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(LoginController.class);
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInController() {
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
        String lotName = request.getParameter("lot");

        UserNameValidator nameValidator = new UserNameValidator();
        PasswordValidator passValidator = new PasswordValidator();
        ParkingNameValidator lotNameValidator = new ParkingNameValidator();
        // validate user details
        try {
            if (nameValidator.validate(userName) && passValidator.validate(password)
                    && lotNameValidator.validate(lotName)) {
                User user = new User();

                user.setParkingLotName(lotName);
                user.setUserName(userName);
                user.setPassword(password);

                if (UserDAOFactory.create().insertUser(user)) {
                    response.sendRedirect("home.jsp");
                }
            }
        } catch (InvalidParkingLotException | InvalidUserNameException e) {
            LOGGER.error(e);
            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
            dispatcher.include(request, response);
            response.getWriter().print(
                    "<center>userName, Password, parkingLot name are not in Valid Format.</center>");
        }

    }

}
