import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        //zapytać o wiek
        //if wiek < 6 "powinienes iść do przedszkola"
        // <12 podstawówki
        // <16 gimnazjum
        // <20
        //else uczelnia

        System.out.println("Cześć!");
        System.out.println("Podaj swój wiek:");
        Scanner scanner = new Scanner(System.in);
        int wiek = scanner.nextInt();

        if (wiek < 6) {
            System.out.println("Powinieneś iść do przedszkola");
        } else if (wiek < 12) {
            System.out.println("Powienieneś iść do podstawówki");
        } else if (wiek < 16) {
            System.out.println("Powinieneś iść do gimnazjum");
        } else if (wiek < 20) {
            System.out.println("Powinieneś iść do szkoły średniej");
        } else {
            System.out.println("Powinieneś iść na uczelnię");
        }
        if (wiek > 30 && wiek % 3 == 0) {
            System.out.println("a");
        if ((wiek < 15 || wiek > 60) && wiek % 5 == 2)
            System.out.println("b");
        }
    }
}