import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter the unit price: ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
