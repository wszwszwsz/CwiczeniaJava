import java.sql.SQLOutput;

public class MultiDimensional {
    public static void main(String[] args) {
        String[] firstNames = {"Karol","Basia","Kasia"};
        String[] lastNames = {"Kowalski","Nowakowska","Wadecka"};

        String[][] firstLast = {firstNames, lastNames};

        System.out.println("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0] );
        System.out.println("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.println("Trzeca osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);

        int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

        int[][] hugeTab = new int[3][];
        hugeTab[0] = longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println("Dlugosc tablic: ");
        System.out.println(hugeTab[0].length + ";" + hugeTab[1].length + ";" +hugeTab[2].length);
        System.out.println("Setny element pierwszej tablicy to: " + hugeTab[0][99]);
    }
}
