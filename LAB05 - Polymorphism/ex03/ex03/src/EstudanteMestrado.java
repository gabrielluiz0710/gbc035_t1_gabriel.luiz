public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo;
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhaDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print(", EstudanteMestrado{" +
                    "tipo='" + tipo + '\'' +
                    ", tituloDissertacao='" + tituloDissertacao + '\'' +
                    '}');
        } else {
            System.out.println("EstudanteMestrado{" +
                    "tipo='" + tipo + '\'' +
                    ", tituloDissertacao='" + tituloDissertacao + '\'' +
                    '}');
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}