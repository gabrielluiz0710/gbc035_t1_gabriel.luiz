public class Main {
    public static void main(String[] args) {
        Figurinhas f1 = new Figurinhas("Alisson", "02/10/1992", 1.93, 91.0, "Goleiro", "Brasil");
        Figurinhas f2 = new Figurinhas("Philippe Coutinho", "12/06/1992", 1.72, 68.0, "Meia", "Brasil");

        System.out.println("Figurinhas clássicas: \n");

        f1.mostrarFigurinha();
        f2.mostrarFigurinha();

        FigurinhasExtra neymar = new FigurinhasExtra("Neymar", "05/02/1992", 1.75, 68.0, "Atacante", "Brasil", "Legends", "Prata");
        FigurinhasExtra cristiano = new FigurinhasExtra("Cristiano Ronaldo", "05/02/1985", 1.87, 83.0, "Atacante", "Portugal", "Rookies", "Ouro");
        FigurinhasExtra messi = new FigurinhasExtra("Messi", "24/06/1987", 1.70, 72.5, "Atacante", "Argentina", "Legends", "Bordô");

        System.out.println("\n\nFigurinhas Raras: \n");

        neymar.mostrarFigurinha();
        messi.mostrarFigurinha();
        cristiano.mostrarFigurinha();

    }
}