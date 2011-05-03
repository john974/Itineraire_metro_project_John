/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class CalculTest {

    public CalculTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of itinerairePassantParStationsDonnees method, of class Calcul.
     */
    @Test
    public void testItinerairePassantParStationsDonnees() {
        System.out.println("itinerairePassantParStationsDonnees");
        ArrayList<Ligne> listeDesLignes = null;
        Station depart = null;
        Station arrivee = null;
        ArrayList<Station> listeStationsDonnees = null;
        ArrayList expResult = null;
        ArrayList result = Calcul.itinerairePassantParStationsDonnees(listeDesLignes, depart, arrivee, listeStationsDonnees);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}