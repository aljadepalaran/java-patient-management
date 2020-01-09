/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Objects;

import coursework.Models.Objects.Session;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class SessionTest {
    
    public SessionTest() {
    }

    /**
     * Test of getInstance method, of class Session.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Session userSession = Session.getInstance("testid");
        userSession.setUID("testid");
        assertEquals("testid", userSession.getUID());
    }

    /**
     * Test of getUID method, of class Session.
     */
    @Test
    public void testGetUID() {
        System.out.println("getUID");
        Session userSession = Session.getInstance("testid");
        userSession.setUID("testid");
        assertEquals("testid", userSession.getUID());
    }

    /**
     * Test of setUID method, of class Session.
     */
    @Test
    public void testSetUID() {
        System.out.println("setUID");
        Session userSession = Session.getInstance("testid");
        userSession.setUID("test2");
        assertEquals("test2", userSession.getUID());
    }
    
}
