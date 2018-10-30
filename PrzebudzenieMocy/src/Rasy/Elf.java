package Rasy;

import Main.AbstractRasyProfesje;

public class Elf extends Main.AbstractRasyProfesjeDekorator {

    public Elf(AbstractRasyProfesje bohater) {
        super(bohater);
    }
    @Override
    public String getRasyProfesje() {
        return bohater.getRasyProfesje() + "Elf(Widzenie w ciemności, super zręczność) ";
    }
}