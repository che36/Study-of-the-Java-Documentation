package ObjectOrientedProgrammingConcepts;

//The following Bicycle class is one possible implementation of a bicycle:
public class Bicycle {
    // The fields cadence, speed, and gear represent the object's state
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    //methods (changeCadence, changeGear, speedUp etc.) define its interaction with the outside world.
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
