package Profesje;

import Main.AbstractRasyProfesje;

public class Mag extends Main.AbstractRasyProfesjeDekorator {

    public Mag(AbstractRasyProfesje bohater) {
        super(bohater);
    }

    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "Mag(Czarowanie, Eliksiry) ";
    }
}
