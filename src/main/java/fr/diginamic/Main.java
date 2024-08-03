package fr.diginamic;

import fr.diginamic.enumerations.Saison;

public class Main {

    public static void main(String[] args) {
        System.out.println(Saison.valueOfLibelle("Eté")); // Affiche: 2. Eté
        System.out.println(Saison.valueOfLibelle("Printemps")); // Affiche: 2. Eté
        System.out.println(Saison.valueOfLibelle("Hiver")); // Affiche: 2. Eté
        System.out.println(Saison.valueOfLibelle("Automne")); // Affiche: 2. Eté


        System.out.println(Saison.ETE);
        System.out.println(Saison.PRINTEMPS);
        System.out.println(Saison.HIVER);
        System.out.println(Saison.AUTOMNE);
    }
}
