package Rasy;

import Main.AbstractRasyProfesje;

public class Lotrzyk extends Main.AbstractRasyProfesjeDekorator {

    public Lotrzyk(AbstractRasyProfesje bohater) {
        super(bohater);
    }
    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "łotrzyk(Latanie, wrażliwy na obrażenia) ";
    }
}