package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.Printer;
/**
 * Created by Röglas on 2017-05-03.
 */
public class Receipt {
    private double cost;

    public Receipt(){
        this.cost = Inspection.getCost();
    }
    public void sendReceipt(){
        Printer.PrintReceipt(cost);
    }

}

