package Profesje;

import Main.AbstractRasyProfesje;

public class Wojownik extends Main.AbstractRasyProfesjeDekorator {

    public Wojownik(AbstractRasyProfesje bohater) {
        super(bohater);
    }
    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "Wojownik (Walka wręcz, walka mieczem, walka toporem, walka włócznią) ";
    }
}
