public class CamaroteSuperior extends VIP {
    private String localizacao;
    private double valorAdicional;

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
        this.valorAdicional = valorAdicional;
    }

    public double getValorCamaroteSuperior() {
        return this.valor + this.valorAdicional;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização do ingresso: " + this.localizacao);
    }
}