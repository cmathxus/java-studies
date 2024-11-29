package devdojo.maratonajava.javacore.Gassociacao.exercicios.test;

import devdojo.maratonajava.javacore.Gassociacao.exercicios.dominio.Professor;
import devdojo.maratonajava.javacore.Gassociacao.exercicios.dominio.Aluno;
import devdojo.maratonajava.javacore.Gassociacao.exercicios.dominio.Local;
import devdojo.maratonajava.javacore.Gassociacao.exercicios.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno1 = new Aluno("Caio", 20);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno1};

        Seminario seminario = new Seminario("Onde achar o one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
