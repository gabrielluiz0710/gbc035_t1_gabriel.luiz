public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];
        formas[0] = new Circulo(2);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(4, 5);
        formas[3] = new Esfera(2);
        formas[4] = new Cubo(3);
        formas[5] = new Tetraedro(4);

        for (Forma forma : formas) {
            System.out.println(descreverForma(forma));
            if (forma instanceof FormaBidimensional) {
                System.out.println("Área: " + ((FormaBidimensional) forma).obterArea());
            } else if (forma instanceof FormaTridimensional) {
                System.out.println("Área: " + ((FormaTridimensional) forma).obterArea());
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
            System.out.println("--------------------");
        }
    }

    public static String descreverForma(Forma forma) {
        if (forma instanceof Circulo) {
            return "Círculo de raio " + ((Circulo) forma).raio;
        } else if (forma instanceof Quadrado) {
            return "Quadrado de lado " + ((Quadrado) forma).lado;
        } else if (forma instanceof Triangulo) {
            return "Triângulo de base " + ((Triangulo) forma).base + " e altura " + ((Triangulo) forma).altura;
        } else if (forma instanceof Esfera) {
            return "Esfera de raio " + ((Esfera) forma).raio;
        } else if (forma instanceof Cubo) {
            return "Cubo de aresta " + ((Cubo) forma).aresta;
        } else if (forma instanceof Tetraedro) {
            return "Tetraedro de aresta " + ((Tetraedro) forma).aresta;
        } else {
            return "Forma desconhecida";
        }
    }

}