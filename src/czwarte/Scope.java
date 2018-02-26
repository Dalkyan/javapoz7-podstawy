package czwarte;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       int[] ints = new int[5];
       String[] names = {"Jan", "Anna", "Marek"};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);   // <= names[i].sout + enter daje ten kod
        }

         scopeOfTypes();
        decimalToBinary();
        BinaryToDecimal();
        String message = "Hello World";

        char[] messageAsCharArray = message.toCharArray();
        int length = messageAsCharArray.length;
        System.out.print(messageAsCharArray[0]);
        System.out.print(messageAsCharArray[1]);
        System.out.print(messageAsCharArray[5]);

        int [] array = {1,2,3,4,5,7}; //jeżeli raz zdefiniuje długość, rozmiar jest stały
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        int a=97;

        for (int i = 0; i <= 122-97; i+=2){
            System.out.print((char) (a+ i));
        }

        for (int i = 97; i<= 122; i++) {
        System.out.print((char)i);
    }
    for (char i = 'z'; i >= 97; i--){
        System.out.print(i);
    }

    }

    private static void BinaryToDecimal() {
        long binaryCode = 101010101011110101L;
        int doubler = 1;
        int decimal=0;
        while (binaryCode != 0)
        { long digit = binaryCode % 10;
        binaryCode /=10;
            decimal += digit * doubler;
            doubler *= 2;
        }
        System.out.println("Decimal= " + decimal);
    }

    private static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to turn into binary:");
        int number = scanner.nextInt();
        int binary = 0;
        int multiplier = 1;
        while (number != 0) {
            int digit = number % 2;
            number /= 2;
            binary += digit * multiplier;
            multiplier *= 10;
        }
        System.out.println(binary);
    }

    private static void scopeOfTypes() {
        int number = 1500000000;
        System.out.println(number + number);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        long bigNumber = 3000000000000L;
        System.out.println(bigNumber);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        String message = "Hello!";
        char character = '$';
        System.out.println(character + 3);

}
}