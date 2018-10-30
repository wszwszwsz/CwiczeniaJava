import java.util.Arrays;
import java.util.Scanner;

public class Hospital {
    public static final int MAX_EMPLOYYES = 3;

    private Person[] employees;

    public Hospital(Person[] employees) {
        this.employees = employees;
    }

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public void add(Person person){
            getEmployees()[0] = person;
    }
    public Hospital(){
        setEmployees(new Person[MAX_EMPLOYYES]);
    }

    @Override
    public String toString() {
        String result = " ";
        result = result + employees[0];
        return result;
    }


}
