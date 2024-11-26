package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 1 - Alocado espaco em memória pro objeto
    // 2 - Cada atributo de uma classe é criado e inicializado com valores default ou o quer for preciso
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {this.nome = nome;}

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
