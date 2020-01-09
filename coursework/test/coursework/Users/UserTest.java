/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Users;

import coursework.Models.Users.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class UserTest {
    
    public UserTest() {
    }

    /**
     * Test of getUniqueID method, of class User.
     */
    @Test
    public void testGetUniqueID() {
        System.out.println("getUniqueID");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        String result = instance.getUniqueID();
        assertEquals("testid", result);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        String result = instance.getPassword();
        assertEquals("testpassword", result);
    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        String result = instance.getFirstName();
        assertEquals("testfirstname", result);
    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        String result = instance.getLastName();
        assertEquals("testlastname", result);
    }

    /**
     * Test of getAccessKey method, of class User.
     */
    @Test
    public void testGetAccessKey() {
        System.out.println("getAccessKey");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        char result = instance.getAccessKey();
        assertEquals('U', result);
    }

    /**
     * Test of getHasObservable method, of class User.
     */
    @Test
    public void testGetHasObservable() {
        System.out.println("getHasObservable");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.update(true);
        boolean result = instance.getHasObservable();
        assertEquals(true, result);
    }

    /**
     * Test of setUniqueID method, of class User.
     */
    @Test
    public void testSetUniqueID() {
        System.out.println("setUniqueID");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.setUniqueID("test2");
        assertEquals(instance.getUniqueID(), "test2");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.setPassword("test2");
        assertEquals(instance.getPassword(), "test2");
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.setFirstName("test2");
        assertEquals(instance.getFirstName(), "test2");
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.setLastName("test2");
        assertEquals(instance.getLastName(), "test2");
    }

    /**
     * Test of setAccessKey method, of class User.
     */
    @Test
    public void testSetAccessKey() {
        System.out.println("setAccessKey");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.setAccessKey('T');
        assertEquals(instance.getAccessKey(), 'T');
    }

    /**
     * Test of update method, of class User.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        User instance = new User("testid","testpassword","testfirstname","testlastname",'U');
        instance.update(true);
        assertEquals(instance.getHasObservable(), true);
    }
    
}
