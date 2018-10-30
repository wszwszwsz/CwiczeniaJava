import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        final String DODAWANIE = "+";
        final String ODEJMOWANIE = "-";
        final String MNOZENIE = "*";
        final String DZIELENIE = "/";
        double a = 0;
        double b = 0;

        Scanner sc = new Scanner(System.in);
        boolean error = true;
        while (error) {
            try {
                System.out.println("Podaj liczby zmiennoprzecinkowe ");
                System.out.println("Podaj a:");

                a = sc.nextDouble();
                sc.nextLine();
                System.out.println("Podaj b: ");
                b = sc.nextDouble();
                sc.nextLine();
                error= false;
            } catch (InputMismatchException e) {
                System.err.println(" podales zly rodzaj, jeszcze raz");
                sc.nextLine();
            }

        }

        System.out.println("Wybierz  jaki chcesz operator +,-,*,/");
        String operator = sc.nextLine();
        switch (operator) {
            case DODAWANIE:
                System.out.println(a + b);
                break;
            case ODEJMOWANIE:
                System.out.println(a - b);
                break;
            case MNOZENIE:
                System.out.println(a * b);
                break;
            case DZIELENIE:
                if(b == 0) {
                    throw new ArithmeticException("Nie mozesz dzielic przez 0!");
                }
                System.out.println(a / b);
                break;
                default:
                    System.out.println("podana zla wartosc");
        }
        sc.close();
    }
}
