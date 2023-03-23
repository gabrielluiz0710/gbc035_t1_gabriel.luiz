public class Main {
    public static void main(String[] args) {
        Figurinhas x = new Figurinhas("Neymar", "05/02/1992", 1.75, 68.7, "Ponta esquerda", "Brasil");
        Figurinhas y = new Figurinhas("Hulk", "25/06/1986", 1.80, 85.6, "Centro avante", "Brasil");
        Figurinhas z = new Figurinhas("Cristiano Ronaldo", "05/02/1992", 1.75, 68.7, "Ponta esquerda", "Brasil");

        x.mostrarFigurinha();
        y.mostrarFigurinha();
        z.mostrarFigurinha();

        x.setPeso(70.0);
        x.setPosicao("Atacante");
        y.setAltura(1.85);
        z.setPais("Portugal");


        System.out.println("\nApós mudanças: \n\n");
        x.mostrarFigurinha();
        y.mostrarFigurinha();
        z.mostrarFigurinha();
    }
}