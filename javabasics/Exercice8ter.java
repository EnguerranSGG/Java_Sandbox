package javabasics;

import java.util.Scanner;

// Reprendre l’exercice précédent et vérifier l’année bissextile dans une fonction

public class Exercice8ter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un mois en chiffre : ");

        int userMonth = scanner.nextInt();

        System.out.println("Entrez une année en chiffre : ");

        int userYear = scanner.nextInt();

        boolean isBissextile = Exercice7.isBissextile(userYear);

        if(userMonth == 2 && isBissextile) {
            System.out.println("Ce mois possède 29 jours ! ");
        } else if(userMonth == 2 && !isBissextile) {
            System.out.println("Ce mois possède 28 jours ! ");
        } else if((userMonth % 2 == 0) && (userMonth <= 7)) {
            System.out.println("Ce mois possède 30 jours !");
        } else if ((userMonth % 2 == 1) && (userMonth > 7)) {
            System.out.println("Ce mois possède 30 jours !");
        } else {
            System.out.println("Ce mois possède 31 jours !");
        }

        scanner.close();
    }
}