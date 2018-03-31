package com.epam.autoparking.web;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JDBCDataSourceExample")
public class JDBCDataSourceExample extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(JDBCDataSourceExample.class);
    private static final long serialVersionUID = 1L;

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Context ctx = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/MyLocalDB");

            con = ds.getConnection();
            stmt = con.createStatement();

            rs = stmt.executeQuery("select * from autoparkingtranscation");

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.print("<html><body><h2>Employee Details</h2>");
            out.print("<table border=\"1\" cellspacing=10 cellpadding=5>");
            out.print("<th>Employee ID</th>");
            out.print("<th>Employee Name</th>");

            while (rs.next()) {
                out.print("<tr>");
                out.print("<td>" + rs.getInt("id") + "</td>");
                out.print("<td>" + rs.getString("registrationNumber") + "</td>");
                out.print("</tr>");
            }
            out.print("</table></body><br/>");

            // lets print some DB information
            out.print("<h3>Database Details</h3>");
            out.print("Database Product: " + con.getMetaData().getDatabaseProductName() + "<br/>");
            out.print("Database Driver: " + con.getMetaData().getDriverName());
            out.print("</html>");

        } catch (NamingException | SQLException e) {
            LOGGER.error(e);
        } finally {
            try {
                rs.close();
                stmt.close();
                con.close();
                ctx.close();
            } catch (SQLException e) {
                LOGGER.error(e);
            } catch (NamingException e) {
                LOGGER.error(e);
            }

        }
    }

}
