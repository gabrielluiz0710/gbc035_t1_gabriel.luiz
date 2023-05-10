public class Main {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.mostrar_atributos();
        c1.mostrar_atributos_super();

        C2 c2 = new C2(10, 20, 30, 40, 50, 60);
        c2.mostrar_atributos();
        c2.mostrar_atributos_super();

        C3 c3 = new C3(100, 200, 300, 400, 500, 600, 700, 800, 900);
        c3.mostrar_atributos();
        c3.mostrar_atributos_super();
    }
}