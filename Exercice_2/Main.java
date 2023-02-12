import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nombre 1");

        double number1 = scanner.nextDouble();

        System.out.println("Entrez le nombre 2");

        double number2 = scanner.nextDouble();

        System.out.println("Entrez le nombre 3");

        double number3 = scanner.nextDouble();

        System.out.println("Les 3 number1, number2, number3 " + number1 + " ," + number2 + " ," + number3);

        System.out.println("Le produit des 3 nombre est : " + product(number1, number2, number3));

        System.out.println("Le somme des 3 nombre est : " + sum(number1, number2, number3));

        System.out.println("Le moyenne des 3 nombre est : " + moyenne(sum(number1, number2, number3)));

        System.out.println("Le moyenne des 3 nombre est : " + Math.min(Math.min(number1, number2), number3));

        System.out.println("Le moyenne des 3 nombre est : " + Math.max(Math.max(number1, number2), number3));
    }

    public static double sum(double number1, double number2, double number3) {

        return Double.sum(Double.sum(number1, number2), number3);
    }

    public static double product(double number1, double number2, double number3) {

        return number1 * number2 * number3;
    }

    public static double moyenne(double sum) {

        return sum / 3;
    }

    
}