package Profesje;

import Main.AbstractRasyProfesje;

public class Lowca extends Main.AbstractRasyProfesjeDekorator {

    public Lowca(AbstractRasyProfesje bohater) {
        super(bohater);
    }

    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "łowca (Skradanie, strzelectwo) ";
    }
}

