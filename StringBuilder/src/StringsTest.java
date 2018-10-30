import java.util.Scanner;

public class StringsTest {
    public static void main(String[] args) {
        System.out.println("Liczba wyrazow");
        Scanner sc = new Scanner(System.in);
        int liczbaWyrazow = sc.nextInt();
        sc.nextLine();

        System.out.println("Poszczegolne wyrazy: ");
        StringBuilder builder = new StringBuilder();

        String[] slowa = new String[liczbaWyrazow];
        for(int i=0; i<liczbaWyrazow; i++){
            slowa[i] = sc.nextLine();
            builder.append(slowa[i].charAt(slowa[i].length() - 1));
        }
        String cos  = builder.toString();
        System.out.println(cos);
        sc.close();

    }
}
