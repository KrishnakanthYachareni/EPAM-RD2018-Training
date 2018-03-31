package org.autoparking.web;

import org.autopaking.model.bean.ParkingLotBean;
import org.autoparking.service.ParkingLotDTO;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayJSONFormat
 */
public class DisplayJSONFormat extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayJSONFormat() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ParkingLotDTO parkingLotDTO = new ParkingLotDTO();
        PrintWriter out = response.getWriter();
        out.print("[");
        for (ParkingLotBean parkingLot : parkingLotDTO.getParkingLotReport()) {
            out.print(parkingLot);
        }
        out.print("]");
    }

}
