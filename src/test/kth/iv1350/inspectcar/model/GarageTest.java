package test.kth.iv1350.inspectcar.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import se.kth.iv1350.inspectcar.model.Display;
import se.kth.iv1350.inspectcar.model.Garage;
import se.kth.iv1350.inspectcar.model.Result;

/**
 * Created by Röglas on 2017-05-04.
 */
public class GarageTest {

    @Test
    public void testQueueNumber() throws Exception {
        Garage garage = new Garage();
        int expResult = 1;
        garage.newCustomer();
        int result = Display.getQueueNumber();
        assertEquals("Wrong queuenumber were found", expResult, result);
    }
    @Test
    public void testCloseDoor() throws Exception {
        boolean expResult = false;
        boolean result = Garage.closeDoor();
        assertEquals("Wrong status on door was found", expResult, result);
    }

    @Test
    public void testOpenDoor() throws Exception {
        boolean expResult = true;
        boolean result = Garage.openDoor();
        assertEquals("Wrong status on door was found", expResult, result);
    }

}