import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value");
        int firstValue = scanner.nextInt();
        System.out.println("Please enter second value");
        int secondValue = scanner.nextInt();
        System.out.println("Please enter third value");
        int thirdValue = scanner.nextInt();

        if (firstValue + secondValue > thirdValue && firstValue + thirdValue > secondValue && secondValue + thirdValue > firstValue)
        {
            System.out.println("This is a triangle");
            int circuit = firstValue + secondValue + thirdValue;
            System.out.println("The average length is: " + ((double)circuit/3));
            System.out.println("Circuit: " + circuit);

        } else {System.out.println("This is not a triangle");}

        if ( (firstValue * firstValue) + (secondValue * secondValue) == thirdValue * thirdValue ) {
            System.out.println("The area of this triangle is: " + ((double) firstValue * secondValue) / 2);
        }

    }
}
