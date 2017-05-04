package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Display {
    private static int queueNumber;

    /*
    * Constructor
    * */
    public static int getQueueNumber() {
        return queueNumber;
    }

    /*
    * Iterates the queueNumber +1 everytime it's called.
    * */
    public static void incrementNumber() {
        queueNumber = queueNumber + 1;
    }


}
