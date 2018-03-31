/*******************************************
 * Copyright Feb 22, 2018 EPAM Systems Pvt Ltd All rights reserved
 *******************************************/

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class GenericServletDemo.
 */
public class GenericServletDemo extends GenericServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see GenericServlet#GenericServlet()
     */
    public GenericServletDemo() {
        super();
    }

    /**
     * @see Servlet#service(ServletRequest request, ServletResponse response)
     */
    @Override
    public void service(final ServletRequest request,
            final ServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        if (name != null) {
            out.print("Welcome to EPAM Systems Pvt Ltd " + name);
        } else {
            out.println("I am in Service method");
        }
    }

}
