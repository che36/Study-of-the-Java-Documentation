package ObjectOrientedProgrammingConcepts;

//In its most common form, an interface is a group of related methods with empty bodies.
// A bicycle's behavior, if specified as an interface, might appear as follows:

public interface Bicycle1 {
    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
