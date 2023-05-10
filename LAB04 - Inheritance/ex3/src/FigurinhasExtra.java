public class FigurinhasExtra extends Figurinhas {
    private String categoria;
    private String cor;

    public FigurinhasExtra(String nome, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nome, dataNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    public FigurinhasExtra(Figurinhas figurinha, String categoria, String cor) {
        super(figurinha.getNome(), figurinha.getDataNascimento(), figurinha.getAltura(), figurinha.getPeso(), figurinha.getPosicao(), figurinha.getPais());
        this.categoria = categoria;
        this.cor = cor;
    }

    @Override
    public void mostrarFigurinha() {
        super.mostrarFigurinha();
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }

}