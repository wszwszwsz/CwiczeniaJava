package Main;

import Profesje.*;
import Rasy.Czlowiek;
import Rasy.Elf;
import Rasy.Krasnolud;
import Rasy.Lotrzyk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrzebudzenieMocy {

    public static void main(String[] args) {
        System.out.println("Witaj w RPG (Przebudzenie Mocy) , udostepniam Tobie mechanizm do tworzenia postaci");
        System.out.println("1=Stworz Postac");
        System.out.println("2=Wyjdz z programu");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if(s==1) {

            AbstractRasyProfesje gracz;
            List<AbstractRasyProfesje> wybory = new ArrayList<>();


            System.out.println("Prosze wybrac w jedna z ras postaci a nastepnie dwie profesje");
            System.out.println("Zaczynamy od wybory Rasy :)");
            System.out.println(" 1=Czlowiek, 2=Elf, 3=Krasnolud, 4=Lotrzyk ");


            gracz = new Gracz();

            int rasa;
            rasa = input.nextInt();
            switch (rasa) {
                case 1:
                    gracz = new Czlowiek(gracz);
                    break;
                case 2:
                    gracz = new Elf(gracz);
                    break;
                case 3:
                    gracz = new Krasnolud(gracz);
                    break;
                case 4:
                    gracz = new Lotrzyk(gracz);
                    break;
                default:
                    System.out.println("Bledny numer");

            }
            System.out.println("Czas na profesje 1=Wojownik, 2=Mag, 3=Zabojca, 4=Zbrojmistrz, 5=Lowca");


            int Profesja1;
            Profesja1 = input.nextInt();

            switch (Profesja1) {
                case 1:
                    gracz = new Wojownik(gracz);
                    break;
                case 2:
                    gracz = new Mag(gracz);
                    break;
                case 3:
                    gracz = new Zabojca(gracz);
                    break;
                case 4:
                    gracz = new Zbrojmistrz(gracz);
                    break;
                case 5:
                    gracz = new Lowca(gracz);
                    break;
                default:
                    System.out.println("Bledny numer");

            }

            System.out.println("Druga profesja: 1=Wojownik, 2=Mag, 3=Zabojca, 4=Zbrojmistrz, 5=Lowca");

            int Profesja2;
            Profesja2 = input.nextInt();

            if (Profesja1 == Profesja2) {
                System.out.println("Nie mozna wybrac 2 razy tej samej profesji");
                return;
            }

            switch (Profesja2) {
                case 1:
                    gracz = new Wojownik(gracz);
                    break;
                case 2:
                    gracz = new Mag(gracz);
                    break;
                case 3:
                    gracz = new Zabojca(gracz);
                    break;
                case 4:
                    gracz = new Zbrojmistrz(gracz);
                    break;
                case 5:
                    gracz = new Lowca(gracz);
                    break;
                default:
                    System.out.println("Bledny numer");

            }
            input.close();

            try {
                ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Postac.txt"));
                out.writeObject(wybory);
                out.close();
            }
            catch(IOException ioe)
            {
                System.out.println("Error!");
            }

            wybory.add(gracz);
            System.out.println(wybory);


        }else return;
    }

}

