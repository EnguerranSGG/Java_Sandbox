package javaobjectsclasses;

import java.util.Scanner;

// Afficher une chaîne de caractères saisies par l’utilisateur en minuscules puis en majuscule

public class Exercice2 {
    
    public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer une chaîne de caractères :");
		
		String userPhrase = scan.next();
		
		System.out.println("Vous avez écris : \n" + userPhrase.toLowerCase() + "\n" + userPhrase.toUpperCase()) ;
		
		scan.close();
	}

}
