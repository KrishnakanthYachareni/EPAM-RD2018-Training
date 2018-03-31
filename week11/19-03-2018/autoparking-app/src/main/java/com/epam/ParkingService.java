/*
 * This is simple REST API Example.
 */
package com.epam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * This is Parking service manager can get the input from web and then it can proceed it.
 * 
 * @author Krishnakanth_Yachare
 *
 */
@Path("/ParkService")
public class ParkingService {

    /**
     * @param vehicleNum vehicle registration number.
     * @return vehicle parking info.
     */
    @GET
    @Path("/park/{param}")
    public Response park(@PathParam("param") final String vehicleNum) {
        String output = "Vehicle has Parked : " + vehicleNum;
        return Response.status(200).entity(output).build();
    }

    /**
     * @param vehicleNum vehicle registration number.
     * @return vehicle unparking info.
     */
    @GET
    @Path("/unpark/{param}")
    public Response unPark(@PathParam("param") final String vehicleNum) {
        String output = "Vehicle has UnParked : " + vehicleNum;
        return Response.status(200).entity(output).build();
    }
}
