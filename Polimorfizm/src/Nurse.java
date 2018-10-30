public class Nurse extends Person{
    private int overtime;

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public Nurse(String firstName, String lastName, int paymant, int overtime) {
        super(firstName, lastName, paymant);
        setOvertime(overtime);
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "overtime=" + overtime +
                '}';
    }
}
