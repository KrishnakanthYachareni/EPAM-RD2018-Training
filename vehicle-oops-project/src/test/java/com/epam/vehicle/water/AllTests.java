package com.epam.vehicle.water;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ BargeTest.class, BoatTest.class, CatamaranTest.class,
        JetSkiTest.class, ShipTest.class, YachtTest.class })
public class AllTests {

}
