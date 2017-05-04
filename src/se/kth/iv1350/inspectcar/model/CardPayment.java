package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.CreditCard;
import se.kth.iv1350.inspectcar.integration.PaymentAuthorization;

/**
 * Created by Röglas on 2017-05-03.
 */
public class CardPayment {
        private double amount;
        private CreditCard card;

        /*
        * Constructor
        * */
        public CardPayment(CreditCard card, double amount){
            this.amount = amount;
            this.card = card;
        }

        /*
        * Authenticates using the authentication service in PaymentAuthorization class and then returns "transaction successful/denied" based on result(Always true in this though).
        * */
        public boolean Authentication(CreditCard card, double amount) {
            boolean auth = PaymentAuthorization.authorizePayment(card, amount);
            if (auth == true){
                System.out.println("Transaction Successful");
                return true;
            }
            else{
                System.out.println("Transaction Denied");
                return false;
            }
        }

}
