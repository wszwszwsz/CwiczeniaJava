import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[2];
        boolean error = true;

        while(error) {
            try {
                System.out.println("Podaj 1 liczbe");
                numbers[0] = sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj 2 liczbe");
                numbers[1] = sc.nextInt();
                sc.nextLine();

                System.out.println("Ktora wartosc wyswietlic(1 lub 2)? ");
                System.out.println(numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Podana wartosc nie jest liczba calkowita");

            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Mialo byc 1 lub 2 znacznijmy od nowa");

            } finally {
                sc.nextLine();
            }
        }

        System.out.println("a dwie liczb ktore podales to: " + numbers[0] + " " + numbers[1]);
        sc.close();
    }
}
