package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Display {
    private static int queueNumber;

    public static int getQueueNumber() {
        return queueNumber;
    }

    public static void incrementNumber() {
        queueNumber = queueNumber + 1;
    }


}
