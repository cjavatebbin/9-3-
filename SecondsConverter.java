
/**
 * Converts an arbitrary number of seconds to a string in "hours, minutes, seconds" format.
 * 
 * @author Terence Wu
 * @version 9/3/2024
 */
public class SecondsConverter {
    /**
     * Converts seconds to hours, minutes, and seconds.
     * For example, if seconds = 50391 the method should return the following
     * String:
     * "13 hours, 59 minutes, and 51 seconds"
     * 
     * @param seconds number of seconds
     * @return a String represenation in hours, minutes, and seconds
     */

    String secondsToHMS(int seconds) {

        int hrs, min, sec;
        sec = seconds%60;
        min = (seconds/60)%60;
        hrs = seconds/3600;
        return hrs+" hours, "+min+" minutes, and "+sec+" seconds";
    }

}
