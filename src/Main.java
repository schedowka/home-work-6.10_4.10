import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи радиус круга: ");
        double cicle = scanner.nextDouble();

        System.out.println("введи сторону квадрата: ");

        int square = scanner.nextInt();
        double sum_cicle = Math.PI*(cicle*cicle);
        int sum_square = square*square;

        if (sum_cicle>sum_square) {
            System.out.println("площадь круга больше " +sum_cicle);
        }
        else{
            System.out.println("площадь квадрата больше " + sum_square);
        }


    }
}