/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework.Functions;

import coursework.Objects.Rating;
import coursework.Objects.Session;
import coursework.Users.User;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author palar
 */
public class MainFunctionsTest {
    
    public MainFunctionsTest() {
    }

    /**
     * Test of charToString method, of class MainFunctions.
     */
    @Test
    public void testCharToString() {
        System.out.println("charToString");
        char[] _input = new char[4];
        _input[0] = 'T';
        _input[1] = 'E';
        _input[2] = 'S';
        _input[3] = 'T';
        String result = MainFunctions.charToString(_input);
        assertEquals(result.compareTo("TEST") == 0, true);
    }

    /**
     * Test of authenticateLogin method, of class MainFunctions.
     */
    @Test
    public void testAuthenticateLogin() {
        Populate.populateFile();
        System.out.println("authenticateLogin");
        String _uniqueID = "A0001";
        String _password = "admin2";
        boolean expResult = true;
        boolean result = MainFunctions.authenticateLogin(_uniqueID, _password);
        assertEquals(expResult, result);
    }

    /**
     * Test of validateDate method, of class MainFunctions.
     */
    @Test
    public void testValidateDate() {
        System.out.println("validateDate");
        String _date = "01011901";
        boolean result = MainFunctions.validateDate(_date);
        assertEquals(result, true);
        String _date2 = "01011900";
        boolean expResult2 = false;
        boolean result2 = MainFunctions.validateDate(_date2);
        assertEquals(expResult2, result2);
    }
    
}
