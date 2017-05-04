package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Printer {

    /*
    * Prints the cost of the inspections as the receipt.
    * */
    public static void PrintReceipt(double cost) {
        System.out.println("Receipt: " + cost);
    }
    /*
    * Prints the name of an inspection.
    * */
    public static void PrintResult(InspectionRegistry i) {
        System.out.println(i.getName());
    }
}
