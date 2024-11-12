package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.nome = "Tom";
        employee.idade = 21;
        employee.salarios = new double []{2300,2400,2500};

        employee.printer();
    }
}
