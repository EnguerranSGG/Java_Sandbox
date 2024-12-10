package javabasics;

import java.util.Scanner;

//Reprendre l’exercice précédent et modifier pour prendre en entrée une chaîne de caractères

public class Exercice8bis {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez un mois en chiffre : ");
        String userMonth = scan.next().toLowerCase().replaceAll("[éè]", "e").replaceAll("[û]", "u");

        switch (userMonth) {
            case "janvier":
                System.out.println("31");
                break;
            case "fevrier":
                System.out.println("28");
                break;
            case "mars":
                System.out.println("31");
                break;
            case "avril":
                System.out.println("30");
                break;
            case "mai":
                System.out.println("31");
                break;
            case "juin":
                System.out.println("30");
                break;
            case "juillet":
                System.out.println("31");
                break;
            case "aout":
                System.out.println("31");
                break;
            case "septembre":
                System.out.println("30");
                break;
            case "octobre":
                System.out.println("31");
                break;
            case "novembre":
                System.out.println("30");
                break;
            case "decembre":
                System.out.println("31");
                break;
            default:
            System.out.println("Veuillez entrer un mois valide :");
                break;
        }

        scan.close();
        
    }

}
