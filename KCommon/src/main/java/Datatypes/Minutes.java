package Datatypes;

/**
 * Created by KamikazeOnRoad on 03.11.2014.
 */
public class Minutes {
    // declaration
    int minutes;

    // getter and setter
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    // constructor
    private Minutes(int minutes) {
        if (minutes >= 0) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("This number is not in range.");
        }
    }

    public Minutes valueOf(int minutes) {
        return new Minutes(minutes);
    }
}
