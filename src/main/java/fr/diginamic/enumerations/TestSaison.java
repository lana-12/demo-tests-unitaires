package fr.diginamic.enumerations;

public class TestSaison {

    public static void main(String[] args) {
        //Exercice 1


        System.out.println(Saison.valueOfLibelle("été"));
        System.out.println(Saison.valueOfLibelle("ETE"));
        System.out.println(Saison.valueOfLibelle("ÉTÉ"));

    }
}
