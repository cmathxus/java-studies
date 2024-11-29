package devdojo.maratonajava.javacore.Gassociacao.exercicios.dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco) {
        this.endereco = endereco;
    }
}
