package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNome("Tom");
        employee.setIdade(21);
        employee.setSalarios(new double []{2300,2400,2500});
        employee.printer();
    }
}
