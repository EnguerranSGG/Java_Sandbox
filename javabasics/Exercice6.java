package javabasics;

import java.util.Scanner;

//À partir d’une valeur saisie, indiquer si le nombre saisi est pair ou impair

public class Exercice6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre :");
        int userNumber = scanner.nextInt();

        if ((userNumber % 2) == 0) {
            System.out.println(userNumber + " est un nombre pair !");
        } else {
            System.out.println(userNumber + " est un nombre impair !");
        }

        scanner.close();
    }
}
