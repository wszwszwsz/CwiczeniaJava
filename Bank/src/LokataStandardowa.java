
public class LokataStandardowa  implements RamaLokat{

   @Override
    public void createAndCalculate(int period, int amount) {
        double percent;
        if (amount >= 1000) {
            if (period == 1) {
                percent = 0.03;
                System.out.println(amount * Math.pow((1 + (percent/1)),period) + " zl");
            }
            if (period == 2) {
                percent = 0.05;
                System.out.println("Wyoskosc lokaty po pierwszym roku");
                System.out.println(amount * Math.pow((1 + (percent/1)),period-1) + " zl");
                System.out.println("Wysokosc Lokaty po dwoch latach");
                System.out.println(amount * Math.pow((1 + (percent/1)),period) + " zl");
            }
            if (period == 3) {
                percent = 0.07;
                System.out.println("Wyoskosc lokaty po pierwszym roku");
                System.out.println(amount * Math.pow((1 + (percent/1)),period-2) + " zl");
                System.out.println("Wysokosc Lokaty po dwoch latach");
                System.out.println(amount * Math.pow((1 + (percent/1)),period-1) + " zl");
                System.out.println("Wysokosc Lokaty po trzech latach");
                System.out.println(amount * Math.pow((1 + (percent/1)),period) + " zl");
            } if(period > 3 || period < 1)
              System.out.println("Podaj poprawny okres lokaty(od 1 roku do 3)");

        } else System.out.println("Zbyt niska kwota");

    }


}
