public class Obliczenia {
    public double l1;
    public double l2;
    String znak;
    public static final String ANSI_YELLOW = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void obliczeniaDodawanie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " + " + l2 + " = " + ANSI_YELLOW + (l1 + l2) + ANSI_RESET);
    }

    public void obliczeniaOdejmowanie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " - " + l2 + " = " + ANSI_YELLOW + (l1 - l2) + ANSI_RESET);
    }

    public void obliczeniaMnozenie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " * " + l2 + " = " + ANSI_YELLOW + (l1 * l2) + ANSI_RESET);
    }

    public void obliczeniaDzielenie(double l1, double l2) {
        System.out.println("\nWynik: " + l1 + " ÷ " + l2 + " = " + ANSI_YELLOW + (l1 / l2) + ANSI_RESET);
    }

    public void obliczeniaPotega(double l1, double l2) {
        double potega = Math.pow(l1, l2);
        System.out.println("\nWynik: " + l1 + " ^ " + l2 + " = " + ANSI_YELLOW + potega + ANSI_RESET);
    }

    public void obliczeniaPierwiastek(double l1) {
        double pierwiastek = Math.sqrt(l1);
        System.out.println("\nWynik: " + "√" + l1 + " = " + ANSI_YELLOW + pierwiastek + ANSI_RESET);
    }
}
