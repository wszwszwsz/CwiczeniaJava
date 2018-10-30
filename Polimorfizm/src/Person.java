public class Person {
    private String firstName;
    private String lastName;
    private int paymant;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPaymant() {
        return paymant;
    }

    public void setPaymant(int paymant) {
        this.paymant = paymant;
    }

    public Person(String firstName, String lastName, int paymant) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.paymant = paymant;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", paymant=" + paymant +
                '}';
    }
}
