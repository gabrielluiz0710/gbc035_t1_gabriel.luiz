public class Main {
    public static void main(String[] args) {
        // Criando ingressos normais
        Ingresso ingressoNormal1 = new Normal(50.0);
        Ingresso ingressoNormal2 = new Normal(80.0);

        // Imprimindo valores e tipos dos ingressos normais
        ingressoNormal1.escreveValor();
        ((Normal) ingressoNormal1).imprimeTipoIngresso();
        System.out.println();
        ingressoNormal2.escreveValor();
        ((Normal) ingressoNormal2).imprimeTipoIngresso();
        System.out.println();

        // Criando ingressos VIP
        VIP ingressoVIP1 = new VIP(100.0, 20.0);
        VIP ingressoVIP2 = new VIP(150.0, 30.0);
        // Imprimindo valores dos ingressos VIP
        ingressoVIP1.escreveValor();
        System.out.println("Valor do ingresso VIP 1 com adicional: R$" + ingressoVIP1.getValorVIP());
        System.out.println();
        ingressoVIP2.escreveValor();
        System.out.println("Valor do ingresso VIP 2 com adicional: R$" + ingressoVIP2.getValorVIP());
        System.out.println();

        // Criando ingressos de camarote inferior
        CamaroteInferior ingressoCamarote1 = new CamaroteInferior(120.0, 30.0, "Setor A, fila 5, assento 10");

        // Imprimindo valores e localizações do ingresso de camarote inferior
        ingressoCamarote1.escreveValor();
        System.out.println("Valor do ingresso de camarote inferior com adicional: R$" + ingressoCamarote1.getValorVIP());
        ingressoCamarote1.imprimeLocalizacao();
        System.out.println();

        // Criando ingressos de camarote superior
        CamaroteSuperior ingressoCamarote2 = new CamaroteSuperior(200.0, 50.0, "Setor VIP, fila 1, assento 1");

        // Imprimindo valores e localizações do ingresso de camarote superior
        ingressoCamarote2.escreveValor();
        System.out.println("Valor do ingresso de camarote superior com adicional: R$" + ingressoCamarote2.getValorCamaroteSuperior());
        ingressoCamarote2.imprimeLocalizacao();
    }
}