package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); 
        Scanner sc2 = new Scanner(System.in);                                                                                   //Definiowanie metody Scanner
        List<Double> numbers = new ArrayList<>();                                                                               //Definiowanie listy liczb zmiennoprzecinkowych
        boolean continueInput = true;                                                                                           //Sprawdzanie czy użytkownik chce kontynuować wprowadzanie liczb

        int i;
        do {
            System.out.print("1 - Start\n2 - Exit\n\nMy Choose | ");
            i = sc1.nextInt();

            if (i == 1) {
                System.out.println("You choosed Start\n=========================================");
                    while (continueInput) {                                                                                     //Pobieranie kolejnych liczb od użytkownika dopóki nie wpisze litery "x"
                        System.out.print("Enter number (x - ends the program) | ");
                        String input = sc2.nextLine();

                        if (input.equals("x")) {
                            continueInput = false;
                        } else {
                            try {
                                double number = Double.parseDouble(input);                                                      //Próba przekształcenia wprowadzonego ciągu znaków na liczbę zmiennoprzecinkową
                                numbers.add(number);                                                                            //Jeśli się to powiedzie to liczba zostaje dodana do listy numbers
                            } catch (NumberFormatException ex) {
                                System.out.println("=========================================\nWrong number format!");      //Jeśli się nie powiedzie to wyświetla się komunikat
                            }
                        }
                    }

                    Calculator calculator = new Calculator();
                    Calculation sum = calculator.new Sum();                                                                     //Definiowanie 4 kolejnych obiektów
                    Calculation diff = calculator.new Diff();
                    Calculation multi = calculator.new Multi();
                    Calculation divid = calculator.new Divid();
                    
                    System.out.println("=========================================\nSum result | " + sum.calculate(numbers));    //Po zakończeniu pętli wyświetla się komunikat + wynik zadeklarowany w klasie nadrzędnej po Calculation
                    System.out.println("Difference result | " + diff.calculate(numbers));
                    System.out.println("Multiplication result | " + multi.calculate(numbers));
                    System.out.println("Division result | " + divid.calculate(numbers));
                    break;
                } else if (i == 2) {
                    System.out.println("Shutting down...");
                } else {
                    System.out.println("Wrong number!\n=============");
                }
        }
        while (i != 2);
    }

    interface Calculation {
        double calculate(List<Double> numbers);
    }

    class Sum implements Calculation {                                                                                          //Klasa po klasie nadrzędnej Calculation, która sumuje liczby z listy
        public double calculate(List<Double> numbers) {
            double sum = 0.0;
            for (double number : numbers) {
                sum += number;
            }
            return sum;
        }
    }

    class Diff implements Calculation {                                                                                         //Klasa po klasie nadrzędnej Calculation, która Odejmuje lkolejne liczby od pierwszej
        public double calculate(List<Double> numbers) {
            double diff = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                diff -= numbers.get(i);
            }
            return diff;
        }
    }

    class Multi implements Calculation {                                                                                        //Klasa po klasie nadrzędnej Calculation, która Mnoży liczby z listy
        public double calculate(List<Double> numbers) {
            double multi = 1.0;
            for (double number : numbers) {
                multi *= number;
            }
            return multi;
        }
    }

    class Divid implements Calculation {                                                                                        //Klasa po klasie nadrzędnej Calculation, która Dzieli kolejne liczby przez pierwszą liczę z listy
        public double calculate(List<Double> numbers) {
            double divid = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) == 0) {
                    throw new ArithmeticException("Don't divide by zero dude 🤬");                                          //Jeśli któraś z liczb będzie równa zero to klasa Divid rzuca wyjątek ArithmeticExpection z komunikatem
                }
                divid /= numbers.get(i);
            }
            return divid;
        }
    }
}
