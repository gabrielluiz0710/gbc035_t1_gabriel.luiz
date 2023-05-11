public class EstudanteDoutorado extends EstudantePosGrad {
    private String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhaDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tituloTese = tituloTese;
    }

    public void print(boolean sameLine) {
        super.print(sameLine);
        if (sameLine) {
            System.out.print(", EstudanteDoutorado{" +
                    "tituloTese='" + tituloTese + '\'' +
                    '}');
        } else {
            System.out.println("EstudanteDoutorado{" +
                    "tituloTese='" + tituloTese + '\'' +
            '}');
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}