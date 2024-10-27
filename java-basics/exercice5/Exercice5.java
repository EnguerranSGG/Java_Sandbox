import java.util.Scanner;

// À partir d’une valeur saisie, vérifier si l’utilisateur est majeur ou mineur
public class Exercice5 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est ton âge ?");
        int userAge = scanner.nextInt();
        
        if (userAge >= 18) {
            System.out.println("Amuse-toi bien !");
        } else {
            System.out.println("Reviens dans " + (18 - userAge) + " ans, jeune homme !");
        }

        scanner.close(); 
    }
}
