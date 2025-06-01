package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give number of items: ");
        int numberOfItems = scanner.nextInt();

        System.out.print("Give seed: ");
        int seed = scanner.nextInt();

        System.out.print("Give knapsack capacity: ");
        int capacity = scanner.nextInt();

        Problem problem = new Problem(numberOfItems, seed, 1, 10);

        System.out.println("\n--- Generated Items ---");
        System.out.println(problem);

        Result result = problem.solve(capacity);

        System.out.println("\n--- Result ---");
        System.out.println(result);
    }
}

