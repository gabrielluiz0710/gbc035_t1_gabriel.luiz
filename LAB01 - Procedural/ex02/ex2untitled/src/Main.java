public class Main {

    public static void main(String[] args) {

        Produtos x = new Produtos("Batata", 7.98f, 500);
        Produtos y = new Produtos("Alface", 5.00f, 15);
        Produtos z = new Produtos("Feijão", 8.70f, 35);

        x.mostrar_produtos();
        y.mostrar_produtos();
        z.mostrar_produtos();

        System.out.println("Haverá um aumento de 30% no preço da batata," +
                "\ndo alface será mantido e o feijão haverá uma redução de 10%.");

        x.altera_preco(30,x);
        z.altera_preco(-10,z);

        System.out.println("Novos preços:\n");

        x.mostrar_produtos();
        y.mostrar_produtos();
        z.mostrar_produtos();
    }
}