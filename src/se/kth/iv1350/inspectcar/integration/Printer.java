package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Printer {

    public static void PrintReceipt(double cost) {
        System.out.println("Receipt: " + cost);
    }

    public static void PrintResult(InspectionRegistry i) {
        System.out.println( i.getName());
    }
}
