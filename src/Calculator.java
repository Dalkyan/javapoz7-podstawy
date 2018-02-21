import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Please insert first value:");

        Scanner reader = new Scanner (System.in);
        int firstValue = reader.nextInt();
        System.out.println("Please insert second value:");
        int secondValue = reader.nextInt();

        System.out.println("Results:");
        int addResult = firstValue + secondValue;
        System.out.println("Result of adding those values = " + addResult);
        int subtractResult = firstValue - secondValue;
        System.out.println("Result of subtracting = " + subtractResult);
        int multiplyResult = firstValue * secondValue;
        System.out.println("Result of multiplying = " + multiplyResult);
        double divideResult = 0;
        if (secondValue != 0) {
            divideResult = (double) firstValue / secondValue;
            System.out.println("Result of dividing = " + divideResult);
        }
        else {
            System.out.println("Cannot divide ");
        }
        System.out.println("Result of adding " + firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println("Result of subtracting " + firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println("Result of multiplying " + firstValue + " * " + secondValue + " = " + (firstValue * secondValue));

        if (secondValue != 0) {
            System.out.println("Result of dividing " + firstValue + " / " + secondValue + " = " + ((double)firstValue / secondValue));
        }
        else {
            System.out.println("Cannot divide");
        }
        //int someValue = reader.nextInt();
        //System.out.println(someValue);
        if (firstValue == secondValue)
        {
            System.out.println("Those values are equal");

        }
        else
        {
            System.out.println("Those values are not equal");

        }

        if (firstValue > secondValue)
        {
            System.out.println(firstValue + " is bigger than " + secondValue);
        }
        else if (firstValue < secondValue)
        {
            System.out.println(firstValue + " is smaller than " + secondValue);
        }

        if (firstValue % secondValue != 0 )
        {
            System.out.println("Modulo is equal " +(firstValue%secondValue) );
        }

        if (firstValue % 2 == 0)
        {
            System.out.println(firstValue + " is even");
        }
        else
            {
            System.out.println(firstValue + " is odd");
        }
    }
}
