package Main;

abstract public class AbstractRasyProfesje {
    protected String RasyProfesje;


    public String getRasyProfesje() {
        return RasyProfesje;
    }

    @Override
    public String toString() {
        return "(" + getRasyProfesje() + ")";
    }
}
