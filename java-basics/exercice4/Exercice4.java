import java.util.Scanner;

// Afficher le périmètre d’un cercle dont le rayon est demandé à l’utilisateur
public class Exercice4 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        double piValue = Math.PI;

        System.out.println("Quel est le rayon de votre cercle ?");
        double circleRadius = scanner.nextDouble();
        System.out.println("Le périmètre de votre cercle est de " + 2 * piValue * circleRadius + " !");

        scanner.close();

    }
}
