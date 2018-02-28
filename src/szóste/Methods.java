package szóste;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int n = 5;
        System.out.println(factorial(n));
        System.out.println("Divisible by 2 and not by 3 = " + countDivisibleBy2ButNot3(array));
        System.out.println("Changed text = " + charChanger("Ala ma kota", ' ', '-'));
        System.out.println("\"123\" is number = " + isThisANumber("123"));
        System.out.println("\"3bla4bla\" is number = " + isThisANumber("3bla4bla"));
        System.out.println("\"Anna\" is palindrom = " + isItPalindrom("Anna"));
        System.out.println("\"bna\" is palindrom = " + isItPalindrom("bna"));
        System.out.println("\"kajak\" is palindrom = " + isItPalindrom("kajak"));
        System.out.println("Switched AbCd = " + switchCase("AbCd"));
       System.out.println("a;b;c 2 = " + getNthIndexOf(';', "a;b;c", 2));
       System.out.println("a;b;c 1 = " + getNthIndexOf(';', "a;b;c", 1));
//       System.out.println("\"Ala ma kota\" split = " + Arrays.toString( split("Ala ma kota", ' ')));
        System.out.println("\"Ala ma kota\" split = " + Arrays.toString( split2("Ala ma kota", ' ')));
//        System.out.println("\"cb;dc;cd\" split = " + Arrays.toString( split("Ala;ma;kota",';')));
        System.out.println( Arrays.toString(split2("Ala ma kota, psa i bobra", ' ')));
        System.out.println("Podaj dla jakiego n obliczyć ciąg Fibonacciego: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fibonacciNumber(number));
        System.out.println(Arrays.toString(fibonacciArray(number)));
        System.out.println("Input line to reverse:");
        String text = scanner.next();
        System.out.println(reverse(text));
        System.out.println("(2-3)-(3+2)*(2-3) is a valid statement =" + isValidStatementWithBrackets("(2-3)-(3+2)*(2-3)"));
    }
    public static String reverse (String text)
    {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2 ; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
         return String.valueOf(array);
    }

    public static boolean isValidStatementWithBrackets (String statement) {
        char[] chars = statement.toCharArray();
        int i = 0;
        int counter = 0;
        while (i < chars.length && counter >= 0)
        {if (chars[i] == '(') {
            counter++;
        }else if (chars[i] == ')') {
            counter--;
        }i++;
        }

        return counter == 0;
    }

    public static int fibonacciNumber(int number){

        if (number <= 1) { return number; }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= number ; i++) {
            int next = first + second;
            first = second;
            second = next;

        } return second;
    }


    public static int[] fibonacciArray(int n) {
            int fibo[]= new int[n+1];
            fibo[0]=0;
            fibo[1]=1;
            for (int i = 2; i < fibo.length; i++) {
                fibo[i] = (fibo[i - 2]) + (fibo[i - 1]); }
            return fibo;
        }

    public static String[] split2 (String message, char c){
        int size = WarmUp.lettersCounter(message, c) + 1;
        String[] resultArray = new String[size];
        int start = 0;
        int end;
        for (int i = 0; i <resultArray.length ; i++) {
            String textToPut = "";
            end= getNthIndexOf(c, message, (i + 1));
            for (int j = start; j < end; j++) {
                textToPut += message.charAt(j);
            }
            resultArray[i]= textToPut;
            start = end + 1;

        }
        return resultArray;
    }

    public static String[] split(String message, char c){
        int size = WarmUp.lettersCounter(message, c) + 1;
        String[] resultArray = new String[size];
        String textToPut = "";
        int j = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != c){
       textToPut += message.charAt(i);}
       if (i == message.length() - 1) {
                resultArray[j] = textToPut;
       }
       else{ resultArray[j] = textToPut;
        j++;
        textToPut = "";
            }
        }
     //   int start = 0;
      //  int end = getNthIndexOf(c, message,0);
        return resultArray;
    }



    public static String switchCase (String text)
    {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = switchCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static char switchCase (char c)
    {// return (c >= 'a' && c <= 'z') ? (char) (c - 32) : ((c >= 'a' && c <= 'z') ? (char) (c - 32) : c);

        if (c >= 'a' && c <= 'z') {
    capitalize(c);} else deCapitalize(c);
    return c;
    }

    public static int getNthIndexOf (char c , String text, int index)
    {
        char[] textAsCharArray = text.toCharArray();
        int i = -1;
        while(i < textAsCharArray.length && index > 0){
            i++;
            if ( i < textAsCharArray.length &&  c == textAsCharArray[i]) {
            index--;}
        }
        return i;

    }


    public static long factorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
             factorial *= i;
        }
        return factorial;
    }
    public static int countDivisibleBy2ButNot3 (int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length ; i++) {

            if (array[i] % 2 == 0 && array[i] % 3 != 0) {
                counter++;
            }
          // alternatywny zapis^  counter += (array[i] % 2 ==0 && array[i] % 3 != 0) ? 1 : 0;
        }return counter;
    }
    public static String charChanger ( String text, char from, char to){
        char[] textAsChars = text.toCharArray();
        for (int i = 0; i <textAsChars.length ; i++) {
            if (textAsChars[i] == from) {
                textAsChars[i] = to;
            }
        }

        return String.valueOf(textAsChars);
    }
public static boolean isThisANumber (String numberCandidate){
    char[] numberCandidateAsChars = numberCandidate.toCharArray();
    boolean result = true;
    int i=0;
    while (i <numberCandidateAsChars.length && (numberCandidateAsChars[i] >= '0' && numberCandidateAsChars[i] <= '9') ) {
    i++;}
    return i == numberCandidateAsChars.length;
//    for (int i = 0; i < numberCandidateAsChars.length ; i++) {
//      if  ('9' < numberCandidateAsChars[i] < '0'){result=false;
//        }
}
public static boolean isItPalindrom(String text){
    char[] chars = text.toCharArray();

int i = 0;
while( i < chars.length/2 && capitalize(chars[i]) == capitalize(chars[chars.length-i-1])){
    i++;
} return i == chars.length/2;

}
    public static char capitalize(char c){ return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c; }
    public static char deCapitalize(char c){ return (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c; }


}
