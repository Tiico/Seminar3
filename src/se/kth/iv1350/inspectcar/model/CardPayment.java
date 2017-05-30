package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.integration.CreditCard;
import se.kth.iv1350.inspectcar.integration.PaymentAuthorization;
import se.kth.iv1350.inspectcar.integration.Printer;

/**
 * Created by Röglas on 2017-05-03.
 */
public class CardPayment {
        private double amount;
        private CreditCard card;
        private PaymentAuthorization paymentAuth;

    /**
     * Constructor
     *
     * @param card  a credit card.
     * @param amount    the amount of money that is supposed to be payed.
     */
    public CardPayment(CreditCard card, double amount){
            this.amount = amount;
            this.card = card;
            this.paymentAuth = new PaymentAuthorization();
        }

    /**
     *  Authenticates using the authentication service in PaymentAuthorization class and then returns
     *  "transaction successful/denied" based on result(Always true in this though).
     *
     * @param card  a credit card.
     * @param amount    the amount of money that is supposed to be payed.
     * @return  returns true or false based on the result.
     */
        public boolean Authentication(CreditCard card, double amount) {
            boolean auth = paymentAuth.authorizePayment(card, amount);
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
