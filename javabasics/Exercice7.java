package javabasics;
/* Vérifier si une année est bissextile.
Pour rappel, une année bissextile est une année multiple de 4, mais pas multiple de 100 ou alors multiple de
400. Cette exercice a été remanié pour fonctionner avec l'exercice 8ter. */

public class Exercice7 {

    public Exercice7() {}

    public static boolean isBissextile(int year) {

        int userYear = year;
        boolean isBissextile = false;

        if (((userYear % 4) == 0) && ((userYear % 100) != 0) || ((userYear % 400) == 0)) {
            System.out.println(userYear + " est une année bissextile !");
            isBissextile = true;
        } else {
            System.out.println(userYear + " n'est pas une année bissextile !");
            isBissextile = false;
        }
        
        return isBissextile;
    }
}
