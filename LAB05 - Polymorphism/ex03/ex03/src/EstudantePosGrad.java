public class EstudantePosGrad extends Estudante {
    private String formacao;
    private String linhaDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhaDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhaDePesquisa = linhaDePesquisa;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print(", EstudantePosGrad{" +
                    "formacao='" + formacao + '\'' +
                    ", linhaDePesquisa='" + linhaDePesquisa + '\'' +
                    '}');
        } else {
            System.out.println("EstudantePosGrad{" +
                    "formacao='" + formacao + '\'' +
                    ", linhaDePesquisa='" + linhaDePesquisa + '\'' +
                    '}');
        }
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }
}