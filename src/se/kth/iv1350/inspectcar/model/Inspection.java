package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.integration.Printer;

import java.util.List;

public class Inspection {

    private final Car car;
    private List<InspectionRegistry> inspections;
    private Printer printer;



    public Inspection(Car car, DBManager dbmgr){
        this.car = car;
        inspections = dbmgr.findInspectionsForCar(car);
        this.inspections = dbmgr.getList();
        this.printer = new Printer();
    }

    /**
    * Prints the full inspections of inspections
    */
    public void fullInspection(){
        System.out.println("--------------------");
        System.out.println("Full Inspection: ");
        for (InspectionRegistry l : inspections){
            printer.PrintResult(l);
        }
        System.out.println("--------------------");
    }
    /**
    * Getters.
    */
    public List<InspectionRegistry> getInspections(){
        return this.inspections;
    }
    public double getCost() {
        double totalCost = 0;
        if (inspections == null) {
            return 0;
        }
        for (InspectionRegistry inspItem : inspections) {
            totalCost = totalCost + inspItem.getCost();
        }
        return totalCost;
    }
}
