import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first score: ");
        double first = input.nextDouble();

        System.out.print("Enter the second score: ");
        double second = input.nextDouble();

        System.out.print("Enter the third score: ");
        double third = input.nextDouble();

        double total = first + second + third;
        double average = total / 3;

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);

        input.close();
    }
}
