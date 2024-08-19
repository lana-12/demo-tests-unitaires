package fr.diginamic.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringUtilsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Avant chaque method de test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Apres chaque method de test");
    }


    @Test
    public void testLevenshteinDistanceCasNominaux() {
        // Arrange
        String mot1 = "chat";
        String mot2 = "chats";

        String mot3 = "machins";
        String mot4 = "machine";

        String mot5 = "aviron";
        String mot6 = "avion";

        String mot7 = "distance";
        String mot8 = "instance";

        String mot9 = "chien";
        String mot10 = "chine";

        // Act
        int distance1 = StringUtils.levenshteinDistance(mot1, mot2);
        int distance2 = StringUtils.levenshteinDistance(mot3, mot4);
        int distance3 = StringUtils.levenshteinDistance(mot5, mot6);
        int distance4 = StringUtils.levenshteinDistance(mot7, mot8);
        int distance5 = StringUtils.levenshteinDistance(mot9, mot10);

        // Assert
        assertEquals(1, distance1);
        assertEquals(1, distance2);
        assertEquals(1, distance3);
        assertEquals(2, distance4);
        assertEquals(2, distance5);
    }

    @Test
    public void testLevenshteinDistanceEmpty() {
        // Arrange
        String emptyString = "";
        String nonEmptyString = "test";

        // Act
        int distance1 = StringUtils.levenshteinDistance(emptyString, emptyString);
        int distance2 = StringUtils.levenshteinDistance(emptyString, nonEmptyString);
        int distance3 = StringUtils.levenshteinDistance(nonEmptyString, emptyString);

        // Assert
        assertEquals(0, distance1);
        assertEquals(4, distance2);
        assertEquals(4, distance3);
    }

    @Test
    public void testLevenshteinDistanceIdentical() {
        // Arrange
        String identicalString = "identique";

        // Act
        int distance = StringUtils.levenshteinDistance(identicalString, identicalString);

        // Assert
        assertEquals(0, distance);
    }

    @Test
    public void testLevenshteinDistanceNull() {
        // Arrange
        String validString = "test";

        // Act & Assert
        assertNull(StringUtils.levenshteinDistance(null, validString));
        assertNull(StringUtils.levenshteinDistance(validString, null));
        assertNull(StringUtils.levenshteinDistance(null, null));
    }


}
