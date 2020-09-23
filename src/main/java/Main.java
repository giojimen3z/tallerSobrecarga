import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Boss gio = new Boss();
        gio.setSalary((double) 500000);
        System.out.println("salario gio = " + gio.getSalary());

        Employee carol= new Employee();
        carol.setSalary((double) 500000);
        System.out.println("salario carol = " + carol.getSalary());

        Scholar david= new Scholar();
        david.setSalary((double) 500000);
        System.out.println("salario david = " + david.getSalary());

        david.setAge(26);
        david.BirthDay(0);

        System.out.println("edad de cumpleaños = " + david.getAge());
    }
}
