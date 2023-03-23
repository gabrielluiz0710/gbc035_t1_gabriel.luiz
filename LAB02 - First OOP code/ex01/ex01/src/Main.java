public class Main {
    public static void main(String[] args) {
        figurinhas x = new figurinhas("Neymar", "05/02/1992", 1.75, 68.7, "Ponta esquerda", "Brasil");
        figurinhas y = new figurinhas("Hulk", "25/06/1986", 1.80, 85.6, "Centro avante", "Brasil");
        figurinhas z = new figurinhas("Cristiano Ronaldo", "05/02/1992", 1.75, 68.7, "Ponta esquerda", "Brasil");

        x.mostrar_figurinha();
        y.mostrar_figurinha();
        z.mostrar_figurinha();
    }
}