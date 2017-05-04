package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.integration.DBManager;
import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.integration.Printer;

import java.util.List;
import java.util.ArrayList;

public class Inspection {

    private final Car car;
    private static List<InspectionRegistry> inspections;


    public Inspection(Car car, DBManager dbmgr){
        this.car = car;
        inspections = dbmgr.findInspectionsForCar(car);
    }

    public void FullInspection(){
        DBManager DB = new DBManager();
        List<InspectionRegistry> list = DB.getList();
        System.out.println("--------------------");
        System.out.println("Full Inspection: ");
        for (InspectionRegistry l : list){
            Printer.PrintResult(l);
        }
        System.out.println("--------------------");
    }

    public static double getCost() {
        double totalCost = 0;
        if (inspections == null) {
            return 0;
        }
        for (InspectionRegistry inspItem : inspections) {
            totalCost = totalCost + inspItem.getCost();
        }
        return totalCost;
    }



    /*
   public InspectionList findInspectionList(String regNo) {
        return null;
    }
    */
}
