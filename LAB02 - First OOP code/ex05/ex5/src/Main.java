public class Main {
    public static void main(String[] args) {
        Selecao selecaoBrasil = new Selecao("Brasil", "Tite", "Brasil");

        Figurinhas f1 = new Figurinhas("Alisson", "02/10/1992", 1.93, 91.0, "Goleiro", "Brasil");
        Figurinhas f2 = new Figurinhas("Danilo", "15/07/1991", 1.84, 76.0, "Lateral Direito", "Brasil");
        Figurinhas f3 = new Figurinhas("Marquinhos", "14/05/1994", 1.83, 75.0, "Zagueiro", "Brasil");
        Figurinhas f4 = new Figurinhas("Thiago Silva", "22/09/1984", 1.83, 78.0, "Zagueiro", "Brasil");
        Figurinhas f5 = new Figurinhas("Alex Sandro", "26/01/1991", 1.81, 76.0, "Lateral Esquerdo", "Brasil");
        Figurinhas f6 = new Figurinhas("Casemiro", "23/02/1992", 1.85, 84.0, "Volante", "Brasil");
        Figurinhas f7 = new Figurinhas("Fabinho", "23/10/1993", 1.88, 78.0, "Volante", "Brasil");
        Figurinhas f8 = new Figurinhas("Neymar Jr.", "05/02/1992", 1.75, 68.5, "Ponta Esquerda", "Brasil");
        Figurinhas f9 = new Figurinhas("Philippe Coutinho", "12/06/1992", 1.72, 68.0, "Meia", "Brasil");
        Figurinhas f10 = new Figurinhas("Richarlison", "10/05/1997", 1.85, 73.0, "Ponta Direita", "Brasil");
        Figurinhas f11 = new Figurinhas("Gabriel Jesus", "03/04/1997", 1.75, 73.0, "Centroavante", "Brasil");

        selecaoBrasil.getJogadores()[0] = f1;
        selecaoBrasil.getJogadores()[1] = f2;
        selecaoBrasil.getJogadores()[2] = f3;
        selecaoBrasil.getJogadores()[3] = f4;
        selecaoBrasil.getJogadores()[4] = f5;
        selecaoBrasil.getJogadores()[5] = f6;
        selecaoBrasil.getJogadores()[6] = f7;
        selecaoBrasil.getJogadores()[7] = f8;
        selecaoBrasil.getJogadores()[8] = f9;
        selecaoBrasil.getJogadores()[9] = f10;
        selecaoBrasil.getJogadores()[10] = f11;


        System.out.println(selecaoBrasil);

        Selecao selecaoArgentina = new Selecao("Argentina", "Lionel Scaloni", "Argentina");

        Figurinhas fa1 = new Figurinhas("Emiliano Martinez", "02/09/1992", 1.94, 90.0, "Goleiro", "Argentina");
        Figurinhas fa2 = new Figurinhas("Gonzalo Montiel", "01/01/1997", 1.78, 70.0, "Lateral Direito", "Argentina");
        Figurinhas fa3 = new Figurinhas("Nicolas Otamendi", "12/02/1988", 1.83, 81.0, "Zagueiro", "Argentina");
        Figurinhas fa4 = new Figurinhas("Cristian Romero", "27/04/1998", 1.85, 75.0, "Zagueiro", "Argentina");
        Figurinhas fa5 = new Figurinhas("Marcos Acuna", "28/10/1991", 1.72, 70.0, "Lateral Esquerdo", "Argentina");
        Figurinhas fa6 = new Figurinhas("Rodrigo De Paul", "24/05/1994", 1.80, 73.0, "Meia", "Argentina");
        Figurinhas fa7 = new Figurinhas("Leandro Paredes", "29/06/1994", 1.80, 76.0, "Meia", "Argentina");
        Figurinhas fa8 = new Figurinhas("Giovani Lo Celso", "09/04/1996", 1.77, 73.0, "Meia", "Argentina");
        Figurinhas fa9 = new Figurinhas("Lionel Messi", "24/06/1987", 1.70, 72.0, "Atacante", "Argentina");
        Figurinhas fa10 = new Figurinhas("Lautaro Martinez", "22/08/1997", 1.74, 76.0, "Atacante", "Argentina");
        Figurinhas fa11 = new Figurinhas("Angel Di Maria", "14/02/1988", 1.80, 75.0, "Atacante", "Argentina");

        selecaoArgentina.getJogadores()[0] = fa1;
        selecaoArgentina.getJogadores()[1] = fa2;
        selecaoArgentina.getJogadores()[2] = fa3;
        selecaoArgentina.getJogadores()[3] = fa4;
        selecaoArgentina.getJogadores()[4] = fa5;
        selecaoArgentina.getJogadores()[5] = fa6;
        selecaoArgentina.getJogadores()[6] = fa7;
        selecaoArgentina.getJogadores()[7] = fa8;
        selecaoArgentina.getJogadores()[8] = fa9;
        selecaoArgentina.getJogadores()[9] = fa10;
        selecaoArgentina.getJogadores()[10] = fa11;

        System.out.println(selecaoArgentina);


    }
}