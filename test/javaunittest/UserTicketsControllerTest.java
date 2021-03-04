/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunittest;

import javax.faces.model.SelectItem;
import managedsPack.UserTicketsController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nasty
 */
public class UserTicketsControllerTest {
    
    public UserTicketsControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

  

    @Test
    public void testInactivate() {
        System.out.println("inactivate");
        UserTicketsController instance = new UserTicketsController();
        String expResult = "userindex?faces-redirect=true";
        String result = instance.inactivate();
        assertEquals(expResult, result);
   
    }

    @Test
    public void testSearchFlight() {
        System.out.println("searchFlight");
        UserTicketsController instance = new UserTicketsController();
        String expResult = "findflight?faces-redirect=true";
        String result = instance.searchFlight();
        assertEquals(expResult, result);
   
    }

}
