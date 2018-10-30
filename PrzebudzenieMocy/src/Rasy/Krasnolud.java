package Rasy;


import Main.AbstractRasyProfesje;

public class Krasnolud extends Main.AbstractRasyProfesjeDekorator {

    public Krasnolud(AbstractRasyProfesje bohater) {
        super(bohater);
    }
    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "krasnolud(Widzenie w ciemności, super wytrzymałość) ";
    }
}