package projekto;

public class Test {
    public static void main(String[] args) {
        TireAndWheel tire = new TireAndWheel();
        tire.setId(123);
        tire.setTireSize("15");
        System.out.println(tire.getId() + " " + tire.getTireSize());
        ExhaustPart ep = new ExhaustPart();
        ep.setId(66);
        ep.setCo2StandartEU(true);
        System.out.println("Zuzyzte czesci czy zgodne z standartem EU? " + ep.isCo2StandartEU() + " ID: " + ep.getId());
    }


}
