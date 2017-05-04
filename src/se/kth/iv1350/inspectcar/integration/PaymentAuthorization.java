package se.kth.iv1350.inspectcar.integration;


public class PaymentAuthorization {

    /*
    * Dummy implementation of an authentication service that always returns true.
    * */
    public static boolean authorizePayment(CreditCard card, double amount) {
        return true;
    }

}
