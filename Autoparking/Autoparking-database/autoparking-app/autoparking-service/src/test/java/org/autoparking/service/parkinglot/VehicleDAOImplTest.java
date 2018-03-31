/**
 * Autaparking application using database.
 */
package org.autoparking.service.parkinglot;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.autoparking.dao.parkinglot.VehicleDAOImpl;
import org.autoparking.model.Vehicle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Set;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class VehicleDAOImplTest {

    /**
     * {@link VehicleDAOImpl}
     */
    @InjectMocks
    VehicleDAOImpl vehicle;


    @Test
    public void testInsertVehicle() {
        Vehicle vehiclePojo = new Vehicle();
        vehiclePojo.setRegistrationID("TS12345678");
        vehiclePojo.setSoltNumber(1);
        assertTrue(vehicle.insertVehicle(vehiclePojo));
    }


    @Test
    public void testGetVehicle() {
        assertThat(vehicle.getVehicle("TS12345678").getRegistrationID(), equalTo("TS12345678"));
    }

    @Test
    public void testGetALLVehicles() {
        Set<Vehicle> vehicles = vehicle.getALLVehicles();
        for (Vehicle vehicle : vehicles) {
            assertTrue(vehicle instanceof Vehicle);
        }
    }

    @Test
    public void testUpdateVehicle() {
        Vehicle vehiclePojo = new Vehicle();
        vehiclePojo.setId(4);
        vehiclePojo.setRegistrationID("TS12345679");
        assertTrue(vehicle.updateVehicle(vehiclePojo));
    }

    @Test
    public void testDeleteVehicle() {
        assertTrue(vehicle.deleteVehicle("TS12345678"));
    }

    @Test
    public void testIsExist() {
        assertTrue(vehicle.isExist("TS12345678"));
    }

    @Test
    public void testOccupiedSlots() {
        assertEquals(vehicle.occupiedSlots(), 2);
    }

}
