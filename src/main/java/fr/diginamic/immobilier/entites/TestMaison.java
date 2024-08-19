package fr.diginamic.immobilier.entites;

import java.util.ArrayList;
import java.util.List;

public class TestMaison {

    public static void main(String[] args) {

        //Exercice 3

        // Ce que j'ai modifier => nbPieces() => enlevé le -1

        //Instance Maison rempli de pièces
        Maison maison1 = new Maison();

        //Instance Maison2 vide
        Maison maison2 = new Maison();

        //Instance des différentes pièces
        List<Piece> pieces = new ArrayList<Piece>();

        Cuisine cuisine = new Cuisine(0, 30);
        Salon salon = new Salon(0, 50);
        Chambre chbre1 = new Chambre(1, 20);
        Chambre chbre2 = new Chambre(1, 15);
        Chambre chbre3 = new Chambre(1, 23);
        Chambre chbreParental = new Chambre(1, 30);
        SalleDeBain sdb1 = new SalleDeBain(1, 10);
        SalleDeBain sdbParental = new SalleDeBain(1, 15);
        WC wc1 = new WC(1, 6);
        WC wc2 = new WC(0, 6);

        pieces.add(cuisine);
        pieces.add(salon);
        pieces.add(chbre1);
        pieces.add(chbre2);
        pieces.add(chbre3);
        pieces.add(chbreParental);
        pieces.add(sdb1);
        pieces.add(sdbParental);
        pieces.add(wc1);
        pieces.add(wc2);

        for (Piece piece : pieces) {
            //System.out.println(piece.getType());
            maison1.ajouterPiece(piece);
        };



        System.out.println(maison1);

        System.out.println("********Marche**********");

        System.out.println("Superficie total" + maison1.calculerSurface()+ "\n"); // 205


        System.out.println("********Ne marche pas**********");
        System.out.println(" - superficieEtage(0) \n - superficieTypePiece(\"CUISINE\") \n - getPieces()");

        //Ne marche pas
        //System.out.println(maison1.superficieEtage(0));

        //Faire des vérification car cuinine, wc =>KO
        //  Cuisnine, WC => ok
        //System.out.println(maison1.superficieTypePiece("CUISINE"));

        // Rajouter des truc dans les methodes car return
        // [Lfr.diginamic.immobilier.entites.Piece;@b4c966a
        //System.out.println(maison1.getPieces());

        System.out.println("************************************");

        System.out.println(maison2.nbPieces());
        System.out.println(maison2.calculerSurface());
    }
}
