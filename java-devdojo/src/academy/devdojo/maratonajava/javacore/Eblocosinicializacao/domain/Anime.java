package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
    }
    public Anime() {
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
