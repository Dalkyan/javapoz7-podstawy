package czwarte;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        int n = 123450050;
        int holdValue = 0;

        while (n != 0)
        { int digit= n % 10;
        holdValue *= 10;
            holdValue += digit;
            n /=10;
        }
        System.out.println("Reversed number = " + holdValue);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int number = scanner.nextInt();
        int sum=0;
    for (int i =0;i < number; i++ )
        {            System.out.println("Enter value:");
            int value= scanner.nextInt();
         //sumowanie cyfr
            while (value != 0) {
                int digit = value % 10;
                sum += digit;
                value /= 10;
            }
        }
        System.out.println("Sum of digits = " + sum);
    int numberWithZeros = 1012023;
    int numberWithoutZeros = 0;
    int multiplier=1;
    while (numberWithZeros !=0)
    {int digit = numberWithZeros % 10;
        numberWithZeros /= 10;
        if (digit != 0)
        {//numberWithoutZeros *=10; - od końca, do odwracania
        numberWithoutZeros += digit * multiplier;
        multiplier *= 10; // do wyświetlania od początku
        }

    }
        System.out.println("Number without zeros: " + numberWithoutZeros);
    }
}

