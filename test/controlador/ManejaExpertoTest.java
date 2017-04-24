/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Experto;
import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class ManejaExpertoTest {
    
    public ManejaExpertoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testGuardaExperto() {
        System.out.println("guardaExperto");
        Experto e = new Experto("E000", "prueba", "pais", "especialidad");
        ManejaExperto instance = new ManejaExperto();
        instance.guardaExperto(e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testEliminaExperto() {
        System.out.println("eliminaExperto");
        Experto e = new Experto("E000", "prueba2", "pais2", "especialidad2");
        ManejaExperto instance = new ManejaExperto();
        instance.eliminaExperto(e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizaExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testActualizaExperto() {
        System.out.println("actualizaExperto");
        Experto e = new Experto("E000", "prueba2", "pais2", "especialidad2");
        ManejaExperto instance = new ManejaExperto();
        instance.actualizaExperto(e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerExperto method, of class ManejaExperto.
     */
    /*@Test
    public void testObtenerExperto() {
        System.out.println("obtenerExperto");
        String idExperto = "E000";
        ManejaExperto instance = new ManejaExperto();
        String nombreResult = "prueba";
        Experto result = instance.obtenerExperto(idExperto);
        assertEquals(nombreResult, result.getNombre());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of iniciaOperacion method, of class ManejaExperto.
     */
    /*@Test
    public void testIniciaOperacion() {
        System.out.println("iniciaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.iniciaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of finalizaOperacion method, of class ManejaExperto.
     */
    /*@Test
    public void testFinalizaOperacion() {
        System.out.println("finalizaOperacion");
        ManejaExperto instance = new ManejaExperto();
        instance.finalizaOperacion();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of manejaExcepcion method, of class ManejaExperto.
     */
    /*@Test
    public void testManejaExcepcion() {
        System.out.println("manejaExcepcion");
        HibernateException he = null;
        ManejaExperto instance = new ManejaExperto();
        instance.manejaExcepcion(he);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/
    
}
