/**
 * Autaparking application using database.
 */
package org.autoparking.service.util;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Krishnakanth
 *
 */
public final class CurrentTime {

    /**
     * Default constructor.
     */
    private CurrentTime() {
        // Do Nothing.
    }

    /**
     * @return current timestamp
     */
    public static final Timestamp getTime() {
        return new Timestamp(new Date().getTime());
    }
}
