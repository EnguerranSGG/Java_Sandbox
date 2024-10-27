import java.util.Scanner;

public class Exercice4 {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        double piValue = Math.PI;

        System.out.println("Quel est le rayon de votre cercle ?");
        double circleRadius = scanner.nextDouble();
        System.out.println("Le périmètre de votre cercle est de " + 2 * piValue * circleRadius + " !");

    }
}
