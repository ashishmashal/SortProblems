package com.bridgelabz;

import java.util.Scanner;

public class SortProblems {
    public static void main(String[] args) {
        System.out.println("Welcome To Sort Problems");

        Scanner scanner = new Scanner(System.in);
        int ans;
        do {
            System.out.println("Enter a No For Edit the Details");
            System.out.println("""
                     1 =  Bubble Sort \s
                     2 = Permutation Recursion\s
                                   
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    BubbleSort bubbleSort = new BubbleSort();
                    bubbleSort.BubbleSortOprations();
                    break;
                case 2:
                    Permutation permutation=new Permutation();
                    permutation.permutationsOprations();
                    break;

                default:
                    System.out.println("Enter Correct choice");

            }
            System.out.println("\n Do Ypu Want To continue ......If Yes The Press '1' ");
            ans = scanner.nextInt();
        } while (ans == 1);

    }
}
