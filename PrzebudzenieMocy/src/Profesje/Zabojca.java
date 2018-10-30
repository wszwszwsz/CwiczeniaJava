package Profesje;

import Main.AbstractRasyProfesje;

public class Zabojca extends Main.AbstractRasyProfesjeDekorator {

    public Zabojca(AbstractRasyProfesje bohater) {
        super(bohater);
    }

    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "Zabojca(Skradanie, trucizny, walka wręcz) ";
    }
}
