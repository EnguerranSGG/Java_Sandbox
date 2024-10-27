import java.util.Scanner;

/* Vérifier si une année est bissextile.
Pour rappel, une année bissextile est une année multiple de 4, mais pas multiple de 100 ou alors multiple de
400. */

public class Exercice7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez une année :");
        int userYear = scanner.nextInt();

        if (((userYear % 4) == 0) && ((userYear % 100) != 0) || ((userYear % 400) == 0)) {
            System.out.println(userYear + " est une année bissextile !");
        } else {
            System.out.println(userYear + " n'est pas une année bissextile !");
        }

        scanner.close();

    }
}
