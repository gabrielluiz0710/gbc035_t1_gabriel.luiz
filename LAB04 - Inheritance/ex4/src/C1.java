public class C1 {
    public int publico = 1;
    protected int protegido = 2;
    private int privado = 3;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, sem parâmetros");
    }

    public C1(int publico, int protegido, int privado) {
        this.publico = publico;
        this.protegido = protegido;
        this.privado = privado;
        System.out.println("Classe C1: chamada do construtor com parâmetros");
    }

    public void mostrar_atributos() {
        System.out.println("Atributos da classe C1:");
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + privado);
    }

    public void mostrar_atributos_super() {
        System.out.println("Atributos da classe C1 (com super):");
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + privado);
    }

    public int getPrivado() {
        return privado;
    }

}