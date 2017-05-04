package test.kth.iv1350.inspectcar.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import se.kth.iv1350.inspectcar.controller.Controller;
import se.kth.iv1350.inspectcar.integration.DBManager;

public class TestController {
    private DBManager dbMgr;
    private Controller instance;

    @Before
    public void setUp() {
        dbMgr = new DBManager();
        instance = new Controller(dbMgr);
    }

    @After
    public void tearDown() {
        dbMgr = null;
        instance = null;
    }

    @Test
    public void testCostWhenThereAreInspections() {
        String existingRegNo = "ABC123";
        double expResult = 60;
        double result = instance.enterRegNo(existingRegNo);
        assertEquals("Wrong cost when inspections were found", expResult, result);
    }

    @Test
    public void testCostWhenThereAreNoInspections() {
        String nonExistingRegNo = "ABC123";
        double expResult = 0;
        double result = instance.enterRegNo(nonExistingRegNo);
        assertEquals("Wrong cost when there were no inspections.", expResult, result);
    }
}
