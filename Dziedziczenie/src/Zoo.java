public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "Czarny";
        System.out.println(cat.color + " Kot daje glos: ");
        cat.makeSound();

        Bird bird = new Bird();
        bird.color = "Niebieski";
        System.out.println(bird.color + " Ptak daje glos: ");
        bird.makeSound();
    }
}
