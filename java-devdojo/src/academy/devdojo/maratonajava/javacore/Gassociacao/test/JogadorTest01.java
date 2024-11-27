package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador jogador4 = new Jogador("Zézinho");
        Jogador jogador5 = new Jogador("Carlinhos");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Jogador[] jogadoresNovatos = {jogador4,jogador5};

        for (Jogador jogador : jogadores) {
            System.out.print("Nome: ");
            jogador.imprime();
            System.out.println();
        }

        System.out.println("----------");

        for (Jogador jogador : jogadoresNovatos) {
            System.out.print("Nome: ");
            jogador.imprime();
            System.out.println();
        }
    }
}