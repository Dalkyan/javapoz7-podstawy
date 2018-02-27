package szóste;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        String[] names = {"Anna", "Maria", "Stefan", "Julian", "Karyna"};
        System.out.println("Women's names = " + femaleNamesCounter(names));
        System.out.println("Number of a in Anna = " + lettersCounter("Anna", 'A'));
        System.out.println("Number of a in " + Arrays.toString(names) + " = " + lettersCounter(names, 'a'));
    }


    public static int femaleNamesCounter(String[] names) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
//            if (names[i].endsWith("a")) {
//                counter++;
//            }
            if (endsWith(names[i],  "a"))
        counter++;}

        return counter;
    }

    public static boolean endsWith(String text, String searchingValue){
       boolean result = false;
        if (searchingValue.length() <= text.length()){
          int i = searchingValue.length() - 1;
            char[] textAsCharArray = text.toCharArray();
            char[] searchValueAsCharArray = searchingValue.toCharArray();
            int aLength = textAsCharArray.length;
            int bLength = searchValueAsCharArray.length;

            while(i >= 0 && searchValueAsCharArray[i] == textAsCharArray[aLength + i - bLength]){
              i--;
          }
          result = i == -1;
        }
         return result;
    }

    public static int lettersCounter(String text, char c){
        char[] chars = text.toCharArray();
        int counter = 0;
        char capitalizedChar = capitalize(c);
        for (int i = chars.length -1; i >= 0 ; i--) {
            if (capitalize(chars[i])== capitalizedChar){
                counter++;
            }
        } return counter;
    }
    public static int lettersCounter(String[] list, char c){
        int counter = 0;
        for (int i = 0; i <list.length ; i++) {
            counter += lettersCounter(list[i], c);
        }
        return counter;
    }


    public static char capitalize(char c){ return (c >= 'a' && c <= 'z') ? (char) (c - 32) : c; }
     //   c += (c == 'a' ? 1 : -1);

//        if (c >= 'a' && c <= 'z') {
//        c = (char) (c-32);                poniższa linijka daje to samo      warunek ? wartośc dla true : wartośc dla false
//    }return c;





}