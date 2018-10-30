public class Doctor extends Person {
    private int premia;

    public int getPremia() {
        return premia;
    }

    public void setPremia(int premia) {
        this.premia = premia;
    }

    public Doctor(String firstName, String lastName, int paymant,int premia) {
        super(firstName, lastName, paymant);
      setPremia(premia);

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "premia=" + premia +
                '}';
    }
}
