package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("How many elements do you want to multiply");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i = i + 1)
        {
            System.out.println("Enter " + (i++) + ". number");
            int number = scanner.nextInt();
           if (number >= 5 && number <=20) {

               System.out.println("Pow(" + number + ") = " + (number * number));
           }else
               System.out.println("Number not supported. Upgrade to full version.");
        }
//
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println("Sum= " + (a + b + c));
    }
}
