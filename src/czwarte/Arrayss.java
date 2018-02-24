package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {

        int size = 5;
        int[] descendingNumbers = new int[size];
        for (int i = 0; i < descendingNumbers.length; i++) {
            descendingNumbers[i] = descendingNumbers.length - i;
                    }
        System.out.println(Arrays.toString(descendingNumbers));

       int[] arrayWithValue = {1, 4, 5, 7, -4, 2};
       int counter = 0;
       while (counter < arrayWithValue.length && arrayWithValue[counter] >= 0 )
       { counter++;
       }
        System.out.println("In index " + counter + " There is a minus value: " + arrayWithValue[counter]);
int[] arrayToBeDoubled = {1,2,4,57,89};
        for (int i = 0; i < arrayToBeDoubled.length; i++) {
            System.out.print(arrayToBeDoubled[i] + " becomes ");
            arrayToBeDoubled[i] *= 2;
            System.out.print(arrayToBeDoubled[i]);
            System.out.println();
        }
        int n = 4;
                int[] newArray = new int[n];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        System.out.println(Arrays.toString(newArray));
        int sum =0;
        int array[] = {1,2,3,4,5,6};

        for (int i=0; i<array.length; i++)
        {sum += array[i];
        }
        System.out.println(sum);
        System.out.println(sum/array.length);
        int min = array[0];
        int max = array[0];

        for (int i =1; i < array.length; i++)
        {if (array[i]< min){  //
            min = array[i];
        }if (array[i] > max){
    max = array[i] ;
                   }

        }
        System.out.println();
        System.out.println("The smallest number is " + min + " and " + max + " is the biggest number in this array.");



        Scanner scanner = new Scanner(System.in);
        int sizeOfUserArray = scanner.nextInt();
        int[] userArray = new int[sizeOfUserArray];
        int sumOfUserArray = 0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("Insert next value:");
            userArray[i] = scanner.nextInt();
            sumOfUserArray += userArray[i];

            int searchingNumber = 6;
            int [] sortedArray = {1,3,5,6,7,8,9};
            int counterForSearching = 0;
            while (sortedArray[counterForSearching] != searchingNumber)
            {
                counterForSearching++;
            }
            System.out.println("We have " + counterForSearching + "numbers smaller than " + searchingNumber);

        }
    }
}
// napisać pętle, która wypisze znaki zakodowane, druga pętla odkoduje szyfr cezara
// (nie)posortowana tablica liczb. tworzymy 2 tablice z elementami mniejszymi i większymi niż N.