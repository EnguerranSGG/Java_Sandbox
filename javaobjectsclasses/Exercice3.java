package javaobjectsclasses;

import java.util.Scanner;

// Dans une chaîne de caractères, remplacer un caractère sur 2 par *

public class Exercice3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer une chaîne de caractères :");
		
		String userPhrase = scan.next();
		
		String newUserPhrase = "";
				
		for(int i = 0; i < userPhrase.length(); i++) {
			if(i % 2 != 0) {
				newUserPhrase += '*';
			} else {
				newUserPhrase += userPhrase.charAt(i);
			}
		}
		
		System.out.println(newUserPhrase);
		
		scan.close();

	}

}
