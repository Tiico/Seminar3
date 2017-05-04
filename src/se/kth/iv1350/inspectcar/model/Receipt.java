package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.Printer;
/**
 * Created by Röglas on 2017-05-03.
 */
public class Receipt {
    private double cost;

    /*
    * Constructor
    * */
    public Receipt(){
        this.cost = Inspection.getCost();
    }
    /*
    * Sends the receipt to the printer which prints it out.
    * */
    public void SendReceipt(){
        Printer.PrintReceipt(cost);
    }

}

