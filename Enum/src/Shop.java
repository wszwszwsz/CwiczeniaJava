public class Shop {
    public static void main(String[] args) {

        System.out.println("Dostepne rozmiary tshirtow");
        for(Size s: Size.values()){
            System.out.println(s.getDescription());
        }

        Tshirt tshirt = new Tshirt();
        System.out.println("Wybierz rozmiar koszulki");
        Size tshirtSize = sizeFromDesciption("Maly");
        tshirt.setSize(tshirtSize);
        System.out.println("Wybrales tshirt w rozmiarze: " + tshirt.getSize().getDescription());

    }

    static Size sizeFromDesciption(String desc){
        for(Size s: Size.values()){
            if(s.getDescription().equals(desc))
                return s;
        }
        return Size.MEDIUM;
    }
}
