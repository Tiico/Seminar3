package se.kth.iv1350.inspectcar.view;

/**
 * Created by Röglas on 2017-05-03.
 */
import se.kth.iv1350.inspectcar.controller.Controller;
import se.kth.iv1350.inspectcar.integration.CreditCard;

public class View {
    private Controller contr;

    private Controller controller;

    public View(Controller contr) {
        this.contr = contr;
    }

    public void Execution() {
        String regNoOfVehicleToInspect = "ABC123";
        double amount = 2500;
        CreditCard card = new CreditCard(2156, "6324524651488574", "Karl Karlsson", "2018-10", 542);

        contr.CallNextInspection();
        contr.OperateDoor(false);
        double cost = contr.EnterRegNo(regNoOfVehicleToInspect);
        contr.AuthenticateCard(card, amount);
        contr.ShowReceipt();
        contr.ShowInspectionList(regNoOfVehicleToInspect);

        contr.ShowInspection();
        contr.EnterResult(true);
        contr.ShowInspection();
        contr.EnterResult(false);
        contr.ShowInspection();
        contr.EnterResult(true);
        contr.ShowInspection();

        System.out.println("The cost is: " + cost);
    }

}