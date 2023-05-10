public class FigurinhasExtra extends Figurinhas {
    private String categoria;
    private String cor;

    public FigurinhasExtra(String nome, String dataNascimento, double altura, double peso, String posicao, String pais, String categoria, String cor) {
        super(nome, dataNascimento, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    @Override
    public void mostrarFigurinha() {
        System.out.println("\nNome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Posição: " + posicao);
        System.out.println("Seleção: " + pais);
        System.out.println("Categoria: " + categoria);
        System.out.println("Cor: " + cor);
    }

}