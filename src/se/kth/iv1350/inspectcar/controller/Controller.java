package se.kth.iv1350.inspectcar.controller;
import se.kth.iv1350.inspectcar.integration.*;
import se.kth.iv1350.inspectcar.model.*;
/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.integration.DBManager;

public class Controller {
    private DBManager dbMgr;

    private Display display;
    private Inspection inspection;
    private InspectionRegistry inspectionRegistry;
    private Controller controller;
    private Result result;

    public Controller(DBManager dbMgr) {
        this.dbMgr = dbMgr;
    }

    public void operateDoor(boolean status) {
        if (status == true){
            Garage.openDoor();
        }
        else{
            Garage.closeDoor();
        }
    }

    public void callNextInspection() {
        Garage.newCustomer();
    }

    public Inspection requestInspections(String regNo) {
        return null;
    }

    public void showInspection(){
        Result.sendResult();
    }

    public void showReceipt(){
        Receipt receipt = new Receipt();
        receipt.sendReceipt();
    }

    public void ShowInspectionList(String regnr){
        DBManager db = new DBManager();
        Car car = new Car(regnr);
        Inspection ins = new Inspection(car, db);
        ins.FullInspection();
    }

    public void enterResult(boolean result) {
        Result.GradeInspections(result);
    }

    public boolean AuthenticateCard(CreditCard card, double amount){
        CardPayment cardPay = new CardPayment(card, amount);

        return cardPay.Authentication(card, amount);
    }

    /*public void storeInspectionResult(boolean result) {

    }
    */
    public double enterRegNo(String regNo) {
        Car car = new Car(regNo);
        Inspection inspection = new Inspection(car, dbMgr);
        return inspection.getCost();
    }

}
