public class Main {
    public static void main(String[] args) {
        Figurinhas figurinha = new Figurinhas("Neymar", "05/02/1992", 1.75, 68.5, "Atacante", "Brasil");
        FigurinhasExtra figurinhaExtra = new FigurinhasExtra(figurinha, "Legends", "Ouro");

        Figurinhas messi = new Figurinhas("Lionel Messi", "24/06/1987", 1.70, 72.0, "Ponta Direita", "Argentina");
        FigurinhasExtra messiRaro = new FigurinhasExtra(messi, "Rookies", "Prata");

        figurinha.mostrarFigurinha();
        figurinhaExtra.mostrarFigurinha();
        messi.mostrarFigurinha();
        messiRaro.mostrarFigurinha();
    }
}