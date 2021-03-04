/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageds.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
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
public class JsfUtilTest {
    
    public JsfUtilTest() {
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
    public void testGetSelectItems() {
        System.out.println("getSelectItems");
        List<String> entities = new ArrayList<>();
        entities.add("Belarus");
        entities.add("USA");
        boolean selectOne = false;
        SelectItem[] expResult = new Array("Belarus","USA") ;
        SelectItem[] result = JsfUtil.getSelectItems(entities, selectOne);
        assertArrayEquals(expResult, result);
       
    }

    @Test
    public void testAddErrorMessage_Exception_String() {
        System.out.println("addErrorMessage");
        Exception ex = null;
        String defaultMsg = "";
        JsfUtil.addErrorMessage(ex, defaultMsg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddErrorMessages() {
        System.out.println("addErrorMessages");
        List<String> messages = null;
        JsfUtil.addErrorMessages(messages);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddErrorMessage_String() {
        System.out.println("addErrorMessage");
        String msg = "";
        JsfUtil.addErrorMessage(msg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddSuccessMessage() {
        System.out.println("addSuccessMessage");
        String msg = "";
        JsfUtil.addSuccessMessage(msg);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRequestParameter() {
        System.out.println("getRequestParameter");
        String key = "";
        String expResult = "";
        String result = JsfUtil.getRequestParameter(key);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetObjectFromRequestParameter() {
        System.out.println("getObjectFromRequestParameter");
        String requestParameterName = "";
        Converter converter = null;
        UIComponent component = null;
        Object expResult = null;
        Object result = JsfUtil.getObjectFromRequestParameter(requestParameterName, converter, component);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
