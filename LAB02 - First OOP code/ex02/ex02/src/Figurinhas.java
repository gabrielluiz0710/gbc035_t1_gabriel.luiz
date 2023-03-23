public class Figurinhas {
    private String nome;
    private String data;
    private Double altura;
    private Double peso;
    private String posicao;
    private String pais;

    public Figurinhas(String name, String date, Double alt, Double p, String pos, String country) {
        this.nome = name;
        this.data = date;
        this.altura = alt;
        this.peso = p;
        this.posicao = pos;
        this.pais = country;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarFigurinha() {
        System.out.println(nome + "\nData de Nascimento: " + data + "\nAltura: " + altura + "\nPeso: " + peso +
                "\nPosição: " + posicao + "\nNacionalidade: " + pais + "\n");
    }
}