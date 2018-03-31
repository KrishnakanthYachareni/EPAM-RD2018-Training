/**
 * This is autoparking web application verison4.
 */
package org.autoparking.api.service;

import org.apache.log4j.Logger;
import org.autoparking.api.exception.InvalidParkingLotException;
import org.autoparking.api.util.CurrentDate;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class VehiclePark extends ParkingLotService {

    /**
     * Parking lot transcation file it can store the all vehciles parking
     * details.
     */
    private static final String PARKINGLOT_TRANSCATION = "AutoTranscation.txt";

    /**
     * Logger declaration.
     */
    private static final Logger LOGGER = Logger.getLogger(VehiclePark.class);

    /**
     * Default constructor.
     */
    public VehiclePark() {
        // Do Nothing.
    }

    @Override
    public final boolean execute(final String registrationNumber)
            throws InvalidParkingLotException {
        boolean shouldExecute = true;
        CurrentDate date = new CurrentDate();

        if (searchVehicle(registrationNumber)) {
            throw new InvalidParkingLotException(
                    registrationNumber + " vehicle has already present");
        }
        List<String> vehicleDetailsList = new ArrayList<>();

        // Get Parking slot number.
        Integer slotNumber = getParkingSlotNumber();

        // Add parking slot number to HashSet.
        getParkingSlots().add(slotNumber);
        /*
         * Add Parking details to the HashMap.
         */
        vehicleDetailsList.add("" + slotNumber);
        vehicleDetailsList.add(date.getDate());
        getParkingLot().put(registrationNumber, vehicleDetailsList);
        // Data storing to file.
        storeDataToTempFile();
        return shouldExecute;
    }

    /**
     * This method write the HashMap data to TEMP File.
     * 
     * @throws IOException {@link IOException}
     */
    private void storeDataToTempFile() {
        try (BufferedWriter bufW =
                Files.newBufferedWriter(Paths.get(PARKINGLOT_TRANSCATION))) {
            for (Map.Entry<String, List<String>>
            entry : getParkingLot().entrySet()) {
                bufW.write(entry.getValue().get(0) + "," + entry.getKey() + ","
                        + entry.getValue().get(1));
                bufW.newLine();
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
