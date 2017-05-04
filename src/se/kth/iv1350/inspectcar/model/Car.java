package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Car {
    private static String registrationNr;

    public Car(String registrationNr) {
        this.registrationNr = registrationNr;
    }

    public static String getRegNo(){
        return registrationNr;
    }
}
