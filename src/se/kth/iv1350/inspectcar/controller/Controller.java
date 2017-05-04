package se.kth.iv1350.inspectcar.controller;
import se.kth.iv1350.inspectcar.integration.*;
import se.kth.iv1350.inspectcar.model.*;
/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.integration.DBManager;

public class Controller {
    private DBManager dbMgr;

    public Controller(DBManager dbMgr) {
        this.dbMgr = dbMgr;
    }

    /*
    * Operate opens or closes door based on input (true = open, false = closed)
    * */
        public void OperateDoor(boolean status) {
        if (status == true){
            Garage.openDoor();
        }
        else{
            Garage.closeDoor();
        }
    }
    /*
    * Calls the newCustomer method in Garage that opens garage door, iterates display and resets the max amount of instructions.
    * */
    public void CallNextInspection() {
        Garage.newCustomer();
    }

    /*
    * Calls the sendResult method which shows the current inspection.
    * */
    public void ShowInspection(){
        Result.sendResult();
    }
    /*
    * Creates an instance of the type Receipt and calls the SendReceipt method which prints the receipt.
    * */
    public void ShowReceipt(){
        Receipt receipt = new Receipt();
        receipt.SendReceipt();
    }
    /*
        * Creates a fresh instance of Inspection using db and car and prints what's to be inspected.
        * */
    public void ShowInspectionList(String regnr){
        DBManager db = new DBManager();
        Car car = new Car(regnr);
        Inspection ins = new Inspection(car, db);
        ins.FullInspection();
    }
    /*
    * Passes the boolean value of true/false to the GradeInspections method.
    * */
    public void EnterResult(boolean result) {
        Result.GradeInspections(result);
    }

    /*
    * Passes the credit card information and amount and checks with the Authentication service (Not fully implemented).
    * */
    public boolean AuthenticateCard(CreditCard card, double amount){
        CardPayment cardPay = new CardPayment(card, amount);
        return cardPay.Authentication(card, amount);
    }
    /*
    * Creates instance based on regNo and checks for the cost of the stored inspection.
    * */
    public double EnterRegNo(String regNo) {
        Car car = new Car(regNo);
        Inspection inspection = new Inspection(car, dbMgr);
        return inspection.getCost();
    }

}
