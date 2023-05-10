public class C2 extends C1 {
    public int publico2 = 4;
    protected int protegido2 = 5;
    private int privado2 = 6;

    public C2() {
        System.out.println("Classe C2: chamada do construtor padrão, sem parâmetros");
    }

    public C2(int publico, int protegido, int privado, int publico2, int protegido2, int privado2) {
        super(publico, protegido, privado);
        this.publico2 = publico2;
        this.protegido2 = protegido2;
        this.privado2 = privado2;
        System.out.println("Classe C2: chamada do construtor com parâmetros");
    }

    public void mostrar_atributos() {
        System.out.println("Atributos da classe C2:");
        System.out.println("publico = " + publico);
        System.out.println("protegido = " + protegido);
        System.out.println("privado = " + getPrivado());
        System.out.println("publico2 = " + publico2);
        System.out.println("protegido2 = " + protegido2);
        System.out.println("privado2 = " + privado2);
    }

    public void mostrar_atributos_super() {
        super.mostrar_atributos_super();
        System.out.println("Atributos da classe C2 (com super):");
        System.out.println("publico2 = " + publico2);
        System.out.println("protegido2 = " + protegido2);
        System.out.println("privado2 = " + privado2);
    }

    public int getPrivado2() {
        return privado2;
    }

}