package com.epam.vehicle.air;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Krishnakanth_Yachare
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AirHotBallonTest.class, AirplaneTest.class, AirshipTest.class,
        HangGliderTest.class, HeliCopterTest.class, JetFighterTest.class,
        RocketPackTest.class, SpaceshipTest.class })
public class AllTests {

}
