/**
 * This is autoparking web application verison4.
 */
package org.autoparking.api.service;

import org.apache.log4j.Logger;
import org.autoparking.api.exception.InvalidParkingLotException;
import org.autoparking.api.util.CurrentDate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

/**
 * @author Krishnakanth_Yachare
 *
 */
public class VehicleUnpark extends ParkingLotService {

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
     * Parking lot transcation file it can store the all vehciles parking and
     * unparking information. It's an permenant log file.
     */
    public static final String PARKINGLOT_TRANSCATION_LOG =
            "AutoTranscationLog.txt";

    /**
     * Default constructor.
     */
    public VehicleUnpark() {
        // Do Nothing.
    }

    @Override
    public final boolean execute(final String registrationNumber)
            throws InvalidParkingLotException {
        String line = null;
        Integer slot = 0;
        boolean shouldExecute = true;
        CurrentDate date = new CurrentDate();

        if (!searchVehicle(registrationNumber)) {
            throw new InvalidParkingLotException(registrationNumber +
                    " vehicle has not present");
        }
        try (BufferedReader reader =
                Files.newBufferedReader(Paths.get(PARKINGLOT_TRANSCATION))) {
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[1].equalsIgnoreCase(registrationNumber)) {
                    slot = Integer.parseInt(arr[0]);
                    line += "," + date.getDate();
                    break;
                }
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
        // Write above data to permanent file.It can has parking and unparking
        // vehicle data.
        try (BufferedWriter bufW =
                Files.newBufferedWriter(Paths.get(PARKINGLOT_TRANSCATION_LOG),
                StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            bufW.write(line);
            bufW.newLine();
        } catch (Exception e) {
            LOGGER.error(e);
        }
        getParkingLot().remove(registrationNumber);
        getParkingSlots().remove(slot);
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
            entry :getParkingLot().entrySet()) {
                bufW.write(entry.getValue().get(0) + "," + entry.getKey() + ","
                        + entry.getValue().get(1));
                bufW.newLine();
            }
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
