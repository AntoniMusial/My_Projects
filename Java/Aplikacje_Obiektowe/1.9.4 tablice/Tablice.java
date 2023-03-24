import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class Tablice {
    public static void main (String[]args) {
        Random r = new Random();
        File uczniowietxt = new File("uczniowie.txt");
        String[] tab_uczniowie = new String[10];
        int[] tab_ocena = new int[10];
        for (int i = 0; i < 10; i++) {
            tab_ocena[i] = r.nextInt(6)+1;
        }
        
        try{
            Scanner odczyt = new Scanner(uczniowietxt);
            for (int j = 0; j < 10; j++) {
                tab_uczniowie[j] = odczyt.nextLine();
            }
            
        } catch(FileNotFoundException e){
            System.out.println("Błąd odczytu z pliku!"+e);
        }

        for (int j = 0; j < 10; j++) {
            String komunikat = tab_uczniowie[j] + " " + tab_ocena[j];
            System.out.println(komunikat);
        }
        
        
    }
}
