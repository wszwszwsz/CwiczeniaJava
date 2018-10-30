package Profesje;

import Main.AbstractRasyProfesje;

public class Zbrojmistrz extends Main.AbstractRasyProfesjeDekorator {

    public Zbrojmistrz(AbstractRasyProfesje bohater) {
        super(bohater);
    }

    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "zbrojmistrz(Naprawa ekwipunku) ";
    }
}
