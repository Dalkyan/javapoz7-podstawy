package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        forLoopExample();
//
        anotherLoop();

    }

    private static void anotherLoop() {
        System.out.println("How many elements do you want to use?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i++)
        {
            System.out.println(i);
        }
        System.out.println("Dooubled: ");
        for (int i = 0; i<n; i++)
        {
            System.out.println((i+1)*2);
        }
        System.out.println("Even: ");
        for (int i = 1; i <= n; i++)
        {
            if ( i % 2 == 0){
            System.out.println(i);
            }
        }
        System.out.println("Divide by 3 ");
        for (int i = 3; i <= n; i++)
        {
            if ( i % 3 == 0){
                System.out.println(i);
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print("a");

        }
        System.out.println();
        for (int i = 0; i < n; i++)
        {
            System.out.print(i*i + " ");

        }
        System.out.println();
        System.out.println("Sum: ");
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + i;

            if (i < n-1)
            {System.out.print(i + " + ");
            }
            else
            {
                System.out.print(i + " = " + sum);
            }
        }
//
        //obliczyć kolejne sumy n liczb
    }

    private static void forLoopExample() {
        System.out.println("How many elements do you want to multiply");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i<n; i = i + 1)
        {
            System.out.println("Enter " + (i+1) + ". number");
            int number = scanner.nextInt();
           if (number >= 5 && number <=20) {

               System.out.println("Pow(" + number + ") = " + (number * number));
           }else
               System.out.println("Number not supported. Upgrade to full version.");
        }
        System.out.println("The end");
    }
}
