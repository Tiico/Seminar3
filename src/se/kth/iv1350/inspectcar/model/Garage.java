package se.kth.iv1350.inspectcar.model;

/**
 * Created by Röglas on 2017-05-03.
 */
public class Garage {

    private static boolean door;

    /*
    * newCustomer increases number on display, resets the max amount of inspections and opens the garagedoor.
    * */
    public static void newCustomer() {
        Display.incrementNumber();
        System.out.println("Queuenumber: " + Display.getQueueNumber());
        Result.InspectionNumber = -1;
        openDoor();
    }
    /*
    * Closes door
    * */
    public static boolean closeDoor(){
        door = false;
        System.out.println("Door: closed");
        return door;
    }
    /*
    * Opens door
    * */
    public static boolean openDoor(){
        door = true;
        System.out.println("Door: open");
        return door;
    }

}
