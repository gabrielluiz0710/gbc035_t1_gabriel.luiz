import java.util.Arrays;
public class Selecao {
    private String nome;
    private String tecnico;
    private Figurinhas[] jogadores;

    public Selecao(String nome, String tecnico, String pais) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new Figurinhas[11];
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Figurinhas(pais);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Figurinhas[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Figurinhas[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "\n\nSelecao: " + nome + "\n" +
                "Tecnico = " + tecnico + "\n" +
                "Jogadores = \n" + Arrays.toString(jogadores);

    }
}