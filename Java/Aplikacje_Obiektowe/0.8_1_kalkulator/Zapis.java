import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zapis {
    String dzialanie;
    public static void main(String[] args) {
        Main main = new Main();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public void mainZapis(double l1, double l2) {
        System.out.println(dzialanie);
    }
}
