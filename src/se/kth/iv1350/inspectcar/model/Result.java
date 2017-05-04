package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.InspectionRegistry;
import se.kth.iv1350.inspectcar.integration.Printer;
import se.kth.iv1350.inspectcar.integration.DBManager;
import java.util.List;

/**
 * Created by Röglas on 2017-05-03.
 */

public class Result {
    static int InspectionNumber = -1;


    public static void GradeInspections(boolean grade){

        DBManager DB = new DBManager();
        List<InspectionRegistry> list = DB.getList();
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

    public static void sendResult() {
        DBManager DB = new DBManager();
        List<InspectionRegistry> list = DB.getList();
        int length = list.size();

        if(++InspectionNumber < length) {
            Printer.PrintResult(list.get(InspectionNumber));
        }
        else {
            System.out.println("Out of Instructions");
        }
        }
    }
