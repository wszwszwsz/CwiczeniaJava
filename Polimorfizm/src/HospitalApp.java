public class HospitalApp {
    public static void main(String[] args) {
        Hospital h = new Hospital();
        h.add(new Person("Wojtek","Jakis",5));
        System.out.println(h);
    }
}
