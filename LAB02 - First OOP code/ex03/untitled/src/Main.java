public class Main {
    public static void main(String[] args) {
        Figurinhas[] jogadores = new Figurinhas[3];
        jogadores[0] = new Figurinhas("Lionel Messi", "24/06/1987", 1.70, 72.1, "Atacante", "Argentina");
        jogadores[1] = new Figurinhas("Virgil van Dijk", "08/07/1991", 1.93, 92.0, "Zagueiro", "Holanda");
        jogadores[2] = new Figurinhas("Kylian Mbappé", "20/12/1998", 1.78, 73.0, "Atacante", "França");

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].mostrarFigurinha();
        }
    }
}