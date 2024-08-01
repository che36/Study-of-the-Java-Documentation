package ObjectOrientedProgrammingConcepts;

public class ACMEBicycle implements Bicycle1 {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    @Override
    public void changeCadence(int newValue) {

    }

    @Override
    public void changeGear(int newValue) {

    }

    @Override
    public void speedUp(int increment) {

    }

    @Override
    public void applyBrakes(int decrement) {

    }
}
