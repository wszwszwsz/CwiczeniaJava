import java.sql.SQLOutput;

public class Director {
    public  void wyliczenia(){
        System.out.println("Machu Machu, jest zgod!  wyliczamy teraz trzy lokaty, Stala, Standardowa i Super Firma");
        System.out.println("wszyscy chca na okres 3 lat");
        System.out.println("Pierw Lokata Standardowa przy kwocie 5000");
        LokataStandardowa test = new LokataStandardowa();
        test.createAndCalculate(3,5000);

        System.out.println("Teraz Lokata Stala na kwote 20000");
        LokataStala test2 = new LokataStala();
        test2.createAndCalculate(3, 20000);

        System.out.println("Teraz Lokata SUPER dla FIRM! Na kwote 2mln zl!");
        LokataSuperFirma test3 = new LokataSuperFirma();
        test3.createAndCalculate(3, 2000000);

        System.out.println("Przesylamy zgodze i informacje o kwecie do pracownika banku");

    }
}
