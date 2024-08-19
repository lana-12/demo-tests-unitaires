package fr.diginamic.immobilier.entites;

import java.util.Arrays;

/**
 * Représente une maison avec toutes ses pièces
 *
 * @author DIGINAMIC
 */
public class Maison {

    /**
     * pieces : tableau de pièces de la maison
     */
    private Piece[] pieces;

    /**
     * Constructeur
     */
    public Maison() {
        // Initialisation du tableau de pièces
        pieces = new Piece[0];
    }

    /**
     * Ajoute une pièce à la maison
     *
     * @param nvPiece nouvelle pièce à ajouter
     */
    public void ajouterPiece(Piece nvPiece) {
        if (nvPiece == null) {
            return; // Ignore l'ajout si la pièce est null
        }
        Piece[] newTab = new Piece[pieces.length + 1];
        for (int i = 0; i < pieces.length; i++) {
            newTab[i] = pieces[i];
        }
        newTab[newTab.length - 1] = nvPiece;
        this.pieces = newTab;
    }



    /**
     * Ne marchait pas avec -1 donc j 'ai enlever
     * @return
     */
    public int nbPieces() {
        return pieces.length ;
    }


    /**
     * Retourne la superficie d'un étage
     *NE marche pas
     * @param choixEtage choix de l'étage
     * @return double
     */
    public double superficieEtage(int choixEtage) {
        double superficieEtage = 0;

        for (int i = 0; i < pieces.length; i++) {
            if (choixEtage == this.pieces[i].getNumEtage()) {
                superficieEtage += this.pieces[i].getSuperficie();
            }
        }

        return superficieEtage;
    }


    /**
     * Retourne la superficie total pour un type de pièce donné
     *
     * @param typePiece type de pièce
     * @return double
     */
    public double superficieTypePiece(String typePiece) {
        double superficie = 0;

        for (int i = 0; i < pieces.length; i++) {
            if (typePiece != null && typePiece.equalsIgnoreCase(this.pieces[i].getType())) {
                superficie += this.pieces[i].getSuperficie();
            }
        }

        return superficie;
    }



    /**
     * Retourne la surface totale => OK
     *
     * @return double
     */
    public double calculerSurface() {
        double superficieTot = 0;

        for (int i = 0; i < pieces.length; i++) {
            superficieTot = superficieTot + this.pieces[i].getSuperficie();
        }

        return superficieTot;
    }

    /**
     * Getter pour l'attribut pieces
     *
     * @return the pieces
     */
    public Piece[] getPieces() {
        return pieces;
    }


    @Override
    public String toString() {
        return "Maison{" +
                "pieces=" + Arrays.toString(pieces) +
                '}';
    }
}