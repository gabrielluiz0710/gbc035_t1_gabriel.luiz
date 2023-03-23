public class figurinhas {
    String nome;
    String data;
    Double altura;
    Double peso;
    String posicao;
    String pais;

    public figurinhas (String name, String date, Double alt, Double p, String pos, String country){
        nome = name;
        data = date;
        altura = alt;
        peso = p;
        posicao = pos;
        pais = country;
    }

    public void mostrar_figurinha(){
        System.out.println(nome + "\n Data de Nascimento: " + data + "\n Altura: " + altura + "\n Peso: " + peso +
                "\n Posição: " + posicao + "\n Nacionalidade: " + pais + "\n\n");
    }

}
