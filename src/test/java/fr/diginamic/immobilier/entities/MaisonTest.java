package fr.diginamic.immobilier.entities;

import fr.diginamic.immobilier.entites.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    private Maison maison;

    @BeforeEach
    void setUp() {
        maison = new Maison();
    }

    @Test
    void testAjouterPiece() {
        Piece salon = new Salon(0, 50);
        maison.ajouterPiece(salon);
        assertEquals(1, maison.nbPieces());
        assertEquals(salon, maison.getPieces()[0]);
    }

    @Test
    void testNbPieces() {
        assertEquals(0, maison.nbPieces());
        maison.ajouterPiece(new Salon(0, 50));
        assertEquals(1, maison.nbPieces());
    }

    @Test
    void testSuperficieEtage() {
        maison.ajouterPiece(new Salon(0, 50));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new WC(1, 5));

        assertEquals(50, maison.superficieEtage(0));
        assertEquals(25, maison.superficieEtage(1));
        assertEquals(0, maison.superficieEtage(2));
    }

    @Test
    void testSuperficieTypePiece() {
        maison.ajouterPiece(new Salon(0, 50));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Chambre(1, 15));

        assertEquals(35, maison.superficieTypePiece("CHAMBRE"));
        assertEquals(50, maison.superficieTypePiece("SALON"));
        assertEquals(0, maison.superficieTypePiece("CUISINE"));
    }


    @Test
    void testCalculerSurface() {
        maison.ajouterPiece(new Salon(0, 50));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new WC(1, 5));

        assertEquals(75, maison.calculerSurface());
    }

    @Test
    void testAjouterPieceNull() {
        maison.ajouterPiece(null);
        assertEquals(0, maison.nbPieces());
    }

    @Test
    void testSuperficieTypePieceNull() {
        maison.ajouterPiece(new Salon(0, 50));
        maison.ajouterPiece(new Chambre(1, 20));

        assertEquals(0, maison.superficieTypePiece(null));
    }

    @Test
    void testSuperficieEtageVide() {
        assertEquals(0, maison.superficieEtage(0));
    }

    @Test
    void testCalculerSurfaceVide() {
        assertEquals(0, maison.calculerSurface());
    }

}
