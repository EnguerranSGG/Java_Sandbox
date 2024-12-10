package javabasics;

import java.util.Scanner;

// À partir d’un mois saisi en chiffre, afficher le nombre de jour d’un mois

public class Exercice8 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez un mois en chiffre : ");
        int userMonth = scan.nextInt();

        if(userMonth == 2) {
            System.out.println("Ce mois possède 28 jours ! ");
        } else if((userMonth % 2 == 0) && (userMonth <= 7)) {
            System.out.println("Ce mois possède 30 jours !");
        } else if ((userMonth % 2 == 1) && (userMonth > 7)) {
            System.out.println("Ce mois possède 30 jours !");
        } else {
            System.out.println("Ce mois possède 31 jours !");
        }

        scan.close();
    }
}
