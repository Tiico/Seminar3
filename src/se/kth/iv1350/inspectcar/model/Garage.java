package se.kth.iv1350.inspectcar.model;

import se.kth.iv1350.inspectcar.model.Display;
/**
 * Created by Röglas on 2017-05-03.
 */
public class Garage {

    private static boolean door;

    public static void newCustomer() {
        Display.incrementNumber();
        System.out.println("Queuenumber: " + Display.getQueueNumber());
        Result.InspectionNumber = -1;
        openDoor();
    }
    public static void closeDoor(){
        door = false;
        System.out.println("Door: closed");
    }
    public static void openDoor(){
        door = true;
        System.out.println("Door: open");
    }

}
