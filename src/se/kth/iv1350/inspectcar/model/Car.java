package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Car {
    private static String registrationNr;

    /*
    * Constructor
    * */
    public Car(String registrationNr) {
        this.registrationNr = registrationNr;
    }

    /*
    * Getter
    * */
    public static String getRegNo(){
        return registrationNr;
    }
}
