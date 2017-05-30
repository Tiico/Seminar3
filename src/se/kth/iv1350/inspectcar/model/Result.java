package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.integration.Printer;
import se.kth.iv1350.inspectcar.integration.DBManager;
import java.util.List;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Result {

    private Printer printer;
    int index = -1;
    private List<InspectionRegistry> list;

    /**
    * Constructor
    */
    public Result(DBManager dbMgr){
        this.list = dbMgr.getList();
        this.printer = new Printer();
    }

    /**
     * Sets the grade as pass or fail based on the inspectors input.
     * @param grade the grade for the inspection.
     */
    public void gradeInspections(boolean grade){
        int i = 0;
        boolean[] grades = new boolean[list.size()];
        if(i++ < grades.length){
            grades[i] = grade;
        }
        if (grades[i] == true) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

    /*
    * Sends one of the inspections every time the method is called to the printer. If we're out of instructions it says so.
    * */
    public void sendResult() {
        int length = list.size();

        if(++index < length) {
            printer.PrintResult(list.get(index));
        }
        else {
            System.out.println("Out of Instructions");
        }
        }
    }
