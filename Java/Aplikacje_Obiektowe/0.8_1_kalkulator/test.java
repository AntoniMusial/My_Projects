import java.util.Scanner;

public class test {
    public static double l1;
    public static double l2;
    public static String znak;
    public static String dzialanie;
    public static void main(String[] args) {


        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", 5);
  
        for (String a : arrOfStr) {
            System.out.println(a);
        }
    }
}
