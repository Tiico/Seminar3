package se.kth.iv1350.inspectcar.integration;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Printer {

    /**
     * Prints the cost of the inspections as the receipt.
     * @param cost the cost for the inspection.
     */
    public void printReceipt(double cost) {
        System.out.println("Receipt: " + cost);
    }

    /**
     * Prints the name of an inspection.
     * @param i the inspection registry
     */
    public void PrintResult(InspectionRegistry i) {
        System.out.println(i.getName());
    }

    /**
     *  Normal String print out.
     * @param message    the massage which shall be printed.
     */
    public void print (String message){
        System.out.println(message);
    }
}
