package devdojo.maratonajava.javacore.Hheranca.test;

import devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco2 = new Endereco();
        endereco.setCep("012345-209");
        endereco.setRua("Rua 3");
        endereco2.setCep("012345-219");
        endereco2.setRua("Rua 2");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");

        pessoa.setEndereco(endereco);
        pessoa.setCpf("123451235");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda nabunaga");
        funcionario.setCpf("1234222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(12345);
        funcionario.imprime();
        System.out.println("---------");
        Funcionario funcionario2 = new Funcionario("Naruto Uzumaki");
        funcionario2.setCpf("2222332342332");
        funcionario2.setEndereco(endereco);
        funcionario2.setSalario(12345);
        funcionario2.imprime();
    }
}
