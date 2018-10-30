package Rasy;

import Main.AbstractRasyProfesje;

public class Czlowiek extends Main.AbstractRasyProfesjeDekorator {

    public Czlowiek(AbstractRasyProfesje bohater) {
        super(bohater);
    }
    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "Czlowiek(Brak zdolnosci rasowych) ";
    }
}