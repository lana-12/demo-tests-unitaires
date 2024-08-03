package fr.diginamic.enumerations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaisonTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Avant chaque method de test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Apres chaque method de test");
    }

    @Test
    public void TestValueOfLibelleCasNominaux() {
        // Arrange
        String libelleEte = "Eté";
        String libelleHiver = "Hiver";
        String libellePrintemps = "Printemps";
        String libelleAutomne = "Automne";

        // Act
        Saison saisonEte = Saison.valueOfLibelle(libelleEte);
        Saison saisonHiver = Saison.valueOfLibelle(libelleHiver);
        Saison saisonPrintemps = Saison.valueOfLibelle(libellePrintemps);
        Saison saisonAutomne = Saison.valueOfLibelle(libelleAutomne);

        // Assert
        assertEquals(Saison.ETE, saisonEte);
        assertEquals(Saison.HIVER, saisonHiver);
        assertEquals(Saison.PRINTEMPS, saisonPrintemps);
        assertEquals(Saison.AUTOMNE, saisonAutomne);

    }

    @Test
    public void TestValueOfLibelleInconnuNullEmpty() {
        // Arrange
        String libelleInconnu = "Inconnu";
        String libelleNull = "null";
        String libelleEmpty = "";

        // Act
        Saison saisonInconnu = Saison.valueOfLibelle(libelleInconnu);
        Saison saisonNull = Saison.valueOfLibelle(libelleNull);
        Saison saisonEmpty = Saison.valueOfLibelle(libelleEmpty);

        // Assert
        assertNull(saisonInconnu);
        assertNull(saisonNull);
        assertNull(saisonEmpty);


    }

    @Test
    public void TestValueOfLibelleMajMin() {
        // Arrange
        String libelleEteMajuscule= "ETE";
        String libelleEteMinuscule = "ete"; // ok

        // Act
        Saison saisonEteMinuscule = Saison.valueOfLibelle(libelleEteMinuscule);
        Saison saisonEteMajuscule = Saison.valueOfLibelle(libelleEteMajuscule);

        // Assert
        assertEquals(Saison.ETE, saisonEteMinuscule);
        assertEquals(Saison.ETE, saisonEteMajuscule);


    }

    @Test
    public void TestValueOfLibelleCaractereSpeciaux() {
        // Arrange
        String libelleEteAccentMinuscul= "été";
        String libelleAccentMajuscule= "ÉTÉ";
//

        // Act
        Saison saisonEteAccentMinuscul = Saison.valueOfLibelle(libelleEteAccentMinuscul);
        Saison saisonEteAccentMajuscule = Saison.valueOfLibelle(libelleAccentMajuscule);

        // Assert
        assertEquals(Saison.ETE, saisonEteAccentMinuscul);
        assertEquals(Saison.ETE, saisonEteAccentMajuscule);


    }



}