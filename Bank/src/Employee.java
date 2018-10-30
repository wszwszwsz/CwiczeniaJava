import java.util.Scanner;

public class Employee {
    public void greeting(){
        String nameTest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Witoj w banku PRZYBYSZU");
        System.out.println("Jak sie nazywasz?");
        nameTest = sc.nextLine();
        if(nameTest.equals("Lukasz")){
            System.out.println("Lukasz Formela, czlowiek Makrela");
        }
        System.out.println(nameTest+ " prosimy o wypelnie wzniosku(Podaje wniosek)");

    }
    public void transfer(){
        System.out.println("Nastepuje przslanie wniosku do dyrektora oddzialu");
    }
    public void decyzja(){
        System.out.println("Prosze bardzo<<Przekazuje decyzje>>, i informacje o " +
                "kwotach jesli jest ona pozytywna");
    }
}
