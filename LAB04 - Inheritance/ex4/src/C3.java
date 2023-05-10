public class C3 extends C2 {
    public int publico3 = 7;
    protected int protegido3 = 8;
    private int privado3 = 9;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, sem parâmetros");
    }

    public C3(int publico, int protegido, int privado, int publico2, int protegido2, int privado2, int publico3, int protegido3, int privado3) {
        super(publico, protegido, privado, publico2, protegido2, privado2);
        this.publico3 = publico3;
        this.protegido3 = protegido3;
        this.privado3 = privado3;
        System.out.println("Classe C3: chamada do construtor com parâmetros");
    }

    public void mostrar_atributos() {
        System.out.println("Atributos da classe C3:");
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + getPrivado());
        System.out.println("publico2 = " + publico2);
        System.out.println("protegido2 = " + protegido2);
        System.out.println("privado2 = " + getPrivado2());
        System.out.println("publico3 = " + publico3);
        System.out.println("protegido3 = " + protegido3);
        System.out.println("privado3 = " + privado3);
    }

    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
        System.out.println("Atributos da classe C3 (com super):");
        System.out.println("publico3 = " + publico3);
        System.out.println("protegido3 = " + protegido3);
        System.out.println("privado3 = " + privado3);
    }
}
