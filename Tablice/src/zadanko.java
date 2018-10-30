import java.sql.SQLOutput;

public class zadanko {
    public static void main(String[] args) {
       zadanko s = new zadanko();
       s.szrosz();

    }
    void szrosz(){
      double[][] table = new double[3][];
      double[] line0 = {1.0,1.5,2.0};
      double[] line1 = {1.5,2.0,2.5};
      double[] line2 = {2.0,2.5,3.0};

      table[0] = line0;
      table[1] = line1;
      table[2] = line2;

        System.out.println(table[0][0]+table[1][1]+table[2][2]);
    }
}
