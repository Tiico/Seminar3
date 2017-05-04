package se.kth.iv1350.inspectcar.integration;

import java.util.Date;

public class CreditCard {
    private final int pin;
    private final String number;
    private final String holder;
    private final String expiryDate;
    private final int CVC;

    /*
    * Constructor
    * */
    public CreditCard(int pin, String number, String holder, String expiryDate, int CVC) {
        this.pin = pin;
        this.number = number;
        this.holder = holder;
        this.expiryDate = expiryDate;
        this.CVC = CVC;

    }
    /*
    * Getters
    * */
    public int getPin() {
        return this.pin;
    }

    public String getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getCVC() {
        return this.CVC;
    }

}
