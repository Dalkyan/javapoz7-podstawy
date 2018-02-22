package trzecie;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        //  firstWhileLoop();
        //  zad1();
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        //  whileLooping(result, scanner);
      //  whileBiggest(result, scanner);
        int number = 134567;

//        int numberOfDigits = 0;
//        while (number != 0 )
//        { number /= 10;
//        numberOfDigits++;
//        }
//        System.out.println(numberOfDigits);
        int sumOfRest = 0;
        while (number != 0)
        {
            sumOfRest= sumOfRest + (number % 10);
            number /= 10;
        }
        System.out.println(sumOfRest);

        int magicNumber = 221113;
        int userVar = scanner.nextInt();
        int counter = 0;
        while (magicNumber !=0)
        {
          int rest = magicNumber % 10;
            if (rest == userVar)
            {
                counter++;
            }
         magicNumber /= 10;
        }
        System.out.println("Digit " + userVar + " is appearing in this number " + counter + " times.");

        int newVariable = scanner.nextInt();
        System.out.println(newVariable + " is divisible by:");
        for (int i = 1; i <= newVariable/2; i++)
        { if(newVariable % i == 0)
                {
                    System.out.print(i + ",");

                }
        }
        int anotherNumber = scanner.nextInt();
int iter = 2;
boolean isPrimary = true;

        while (isPrimary && iter <= Math.sqrt(anotherNumber) )
        {
            if (anotherNumber % iter ==0)
            {
                isPrimary= false;
            }

            if (isPrimary)
            {
                System.out.println("This number is only divisible by 1 and itself");

            }else {
                System.out.println("This number is not primary");
            }
            iter++;
        }
    }



    private static void whileBiggest(boolean result, Scanner scanner) {
        int biggest = 0;
        while (result) {
            int number = scanner.nextInt(); ///można poza pętlą określić i wtedy while (number !=0)
            if (biggest < number) {
                biggest = number;
            }
            result = number != 0;
        }
        System.out.println("The biggest number: " + biggest);
    }

    private static void whileLooping(boolean result, Scanner scanner) {
        int sum = 0;
        while (result)
        {int value = scanner.nextInt();
         sum+=value;
//         if (value == 0)
//         {
//            result = false;
//         }

         result = value !=0;  //robi to samo co pętla wyżej - daje
        }
        System.out.println("Sum = " + sum);
        result= true;
        while (result)
        {
            System.out.println("Lubie placki, a czy chcesz wyjsc? Jesli tak nacisnij 1");
            int odp = scanner.nextInt();
            result = odp != 1;


        }
    }

    private static void zad1() {
        Scanner scanner = new Scanner(System.in);
        int tmp = 1;
        while (tmp % 15 != 0)
        {
            tmp = scanner.nextInt();
        }
        System.out.println("This number can be divided by 15");
    }

    private static void firstWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        int sum = 10;
        int tmp = 0;
        int i =0;
        while (tmp < sum) {
            int value = scanner.nextInt();
            tmp += value;
            i++;
        }
        System.out.println("Inserted " + i + " numbers");
    }
}
