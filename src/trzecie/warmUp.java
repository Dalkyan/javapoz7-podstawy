package trzecie;

import java.util.Scanner;

public class warmUp {
    public static void main(String[] args) {

     //   zad1();
     //   zad2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times do you want to enter new value");

//        int n = scanner.nextInt();
//        int sumOfSomeEvenNumbers = 0;
//  for (int i = 0; i < n; i++) {
//    if (i % 2 == 0 && i % 3 != 0)
//        {
//        sumOfSomeEvenNumbers += i;
//        }
//    }System.out.println("Sum of some even numbers = " + sumOfSomeEvenNumbers);

        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0)
            {
                factorial *= i;
            }
        }System.out.println("Factorial = " + factorial);
    }


    private static void zad2() {
        System.out.println("Enter how many times do you want to enter new value");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int comparison = 0;
        for (int i = 1; i <= n; i++)
        {
            System.out.println();
            System.out.println("Enter " + (i) + ". number");
            int number = scanner.nextInt();

            if (number > comparison)
            {
                System.out.println(number + " is bigger than " + comparison);
            }else if (number < comparison)
            {
                System.out.println(number + " is smaller than " + comparison);
            }else {System.out.println("Those numbers are equal");}
            comparison = number;
        }
    }

    private static void zad1() {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i = i + 1)
        {
            System.out.println("Enter " + (i) + ". number");
            int number = scanner.nextInt();
            if (number % 6 ==0) {

                System.out.println(number + " can be divided by 6");
            } else if (number % 3 == 0)
            {
                System.out.println(number + " can be divided by 3");

            } else if (number % 2 ==0)
            {
                System.out.println(number + " is even");
            }
            else
                System.out.println("Number not supported. Upgrade to full version.");
        }
    }
}
//Wczytać liczbę n
//zapytać n razy o liczbę
//jeśli parzysta - podzielna przez dwa, jeśli przez trzy, też napisać, jeżeli jest podielna przez



