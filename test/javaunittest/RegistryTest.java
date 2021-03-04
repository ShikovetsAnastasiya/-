/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunittest;

import managedsPack.Registry;
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
public class RegistryTest {
    
    public RegistryTest() {
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
    public void testDoRegistry() {
        System.out.println("doRegistry");
        Registry instance = new Registry();
        String expResult = "index?faces-redirect=true";
        String result = instance.doRegistry("Ana","shik","shik","Anastasiya",
                "Shikovets","MR777","Country");
        assertEquals(expResult, result);
     
    }

}
