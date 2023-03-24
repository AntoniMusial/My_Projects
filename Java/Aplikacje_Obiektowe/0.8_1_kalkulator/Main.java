import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        //TWORZENIE OBIEKTU
        Obliczenia obliczenia = new Obliczenia();
         

        //SCANNER
        Scanner scanner = new Scanner(System.in);

        //PORADNIK
        System.out.println("========\nPORADNIK\n========");
        //KONIEC PORADNIKA

        //PODAJ DZIALANIE
        System.out.println("\n==================\nWprowadź działanie");
        String dzialanie = scanner.nextLine();
        System.out.println("==================");

        String[] liczby = dzialanie.replaceAll("^\\D+","").split("\\D+");

        double l1 = Integer.parseInt(liczby[0]);
        double l2 = Integer.parseInt(liczby[1]);
        //KONIEC DZIAŁAŃ

        //WARUNKI
        if (dzialanie.contains("+")) {
            obliczenia.obliczeniaDodawanie(l1, l2);
        } else if (dzialanie.contains("-")) {
            obliczenia.obliczeniaOdejmowanie(l1, l2);
        } else if (dzialanie.contains("*")) {
            obliczenia.obliczeniaMnozenie(l1, l2);
        } else if (dzialanie.contains("/")) {
            obliczenia.obliczeniaDzielenie(l1, l2);
        } else if (dzialanie.contains("^")) {
            obliczenia.obliczeniaPotega(l1, l2);
        } else if (dzialanie.contains(".")) {
            obliczenia.obliczeniaPierwiastek(l1);
        }
    }
}
