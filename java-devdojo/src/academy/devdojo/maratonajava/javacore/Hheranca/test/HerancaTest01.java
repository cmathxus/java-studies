package devdojo.maratonajava.javacore.Hheranca.test;

import devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("012345-209");
        endereco.setRua("Rua 3");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("123451235");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda nabunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(12345);
        funcionario.imprime();
    }
}
