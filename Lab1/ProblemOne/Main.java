package Lab1.ProblemOne;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        LoggingSortingUtility sortingUtility = new LoggingSortingUtility();
        List<Product> products = new ArrayList<>();
        int sortingApproach;
        String productID;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many products would you like to log?");
        int numOfProducts = scanner.nextInt();

        for(int i = 0; i < numOfProducts; i++) {
            scanner.nextLine(); // for junk contents

            // product ID
            System.out.println("Enter product id:");
            productID = scanner.nextLine();

            Product insert = new Product(productID);

            // product name
            System.out.println("Enter product name:");
            insert.setName(scanner.nextLine());

            // product price
            System.out.println("Enter product price:");
            insert.setPrice(scanner.nextInt());

            products.add(insert);
        }

        System.out.println("What sorting approach would you like to use:\n" +
                            "0: Quick Sort\n" +
                            "1: Bubble Sort");

        sortingApproach = scanner.nextInt();

        sortingUtility.sort(sortingApproach, products);
    }
}
