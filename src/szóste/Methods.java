package szóste;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

    }
    public static String[] split(String message, char c){
       // String[] array = new int[WarmUp.lettersCounter(message, c)];
        int start = 0;
      //  int end = getNthIndexOf(c, message,0);
        return array;
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

}
