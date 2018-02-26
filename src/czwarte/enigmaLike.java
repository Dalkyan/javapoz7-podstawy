package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class enigmaLike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your hidden message?");
        String hiddenMessage = scanner.nextLine();

        char[] hMArray = hiddenMessage.toCharArray();
        int offset = 2;
        for (int i = 0; i <hMArray.length ; i++) {
            if ((hMArray[i] >= 'a' && hMArray[i] <= 'z') || (hMArray[i] >= 'A' && hMArray[i] <= 'Z')) {
                if (hMArray[i] + offset > 'Z' && hMArray[i] + offset < 'a' || (hMArray[i] + offset > 'z')) {
                    hMArray[i] = (char) (hMArray[i] - 26 + offset);
                } else hMArray[i] += offset;
            }
        }
        System.out.println("Correct: " + String.valueOf(hMArray));


        //odkodowywanie
        String codedMessage = "bmb nb lpuAb az";
//        char[] charsOfCodedMessage  = codedMessage.toCharArray();
//        int decodeOffset = 1;
//        for (int i = 0; i < charsOfCodedMessage.length ; i++) {
//            if ((charsOfCodedMessage[i] >= 'a' && charsOfCodedMessage[i] <= 'z')) || (charsOfCodedMessage[i] >= 'A' && charsOfCodedMessage[i] <= 'Z')) {
//                if ( charsOfCodedMessage[i] - decodeOffset > 'Z' && charsOfCodedMessage[i] - decodeOffset < 'a' || (charsOfCodedMessage[i] - decodeOffset > 'z')) {
//                    charsOfCodedMessage[i] = (char) (charsOfCodedMessage[i] + 26 - decodeOffset);
//                } else charsOfCodedMessage[i] -= decodeOffset;
//            }
//        }
//        System.out.println("Correct: " + String.valueOf(charsOfCodedMessage));


//        System.out.println("Decrypted message: ");
//        System.out.println(hMArray);


        System.out.println("How long array do you want?");
        int leng = scanner.nextInt();
        int[] numbers = new int[leng];
        for (int j = 0; j < numbers.length ; j++) {
            numbers[j]=j+1;
                    }
        System.out.println("Enter your magic number:");
        int magicNumber = scanner.nextInt();

        int i = 0;
        while (i< numbers.length && numbers[i] != magicNumber) {
            i++;
        }
        if (i < numbers.length) {
            int [] smallerNumbersArray = new int [i+1];
            int [] biggerNumbersArray = new int [numbers.length - (i+1)];

            for (int j = 0; j < smallerNumbersArray.length ; j++) {
                smallerNumbersArray[j]=numbers[j];
            }
            for (int j = 0; j < biggerNumbersArray.length; j++) {
                biggerNumbersArray[j] = numbers[j] + i+ 1;
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(smallerNumbersArray));
            System.out.println(Arrays.toString(biggerNumbersArray));
        } else {
            System.out.println("Number " + magicNumber + " not found" );
        }

    }
}
