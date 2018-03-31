package com.epam.vehicle.land;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ BicycleTest.class, BusTest.class, CarTest.class,
        MetroTest.class, MotorCycleTest.class, QuadBikeTest.class,
        ScooterTest.class, SegwayTest.class, SnowMobileTest.class,
        TankTest.class, TrainTest.class, TramTest.class, VanTest.class })
public class AllTests {

}
