package javaobjectsclasses;

import java.util.Scanner;

// Compter le nombre de chaque lettre d’une chaîne de caractères saisis par l’utilisateur

public class Exercice1 {

    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer une chaîne de caractères :");
		
		int count = scan.next().length();
		
		System.out.println("Votre chaîne fait " + count + " caractères." );
		
		scan.close();
	}
    
}
