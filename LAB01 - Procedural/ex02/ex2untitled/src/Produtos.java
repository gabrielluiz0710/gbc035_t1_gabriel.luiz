public class Produtos {
    private String nome;
    private float preco;
    private int qtd;

    public Produtos() {
        nome = "";
        preco = 0;
        qtd = 0;
    }

    public Produtos(String n, float p, int q){
        nome = n;
        preco = p;
        qtd = q;
    }

    public int altera_preco(int porcentagem, Produtos x){
        float valor;
        valor = x.preco;
        if(porcentagem < -100){
            return -1; //retorna -1 quando a redução percentual é absurda
        }
        else{
            x.preco = valor * (1f + porcentagem/100f);
            return 0;
        }
    }

    public void mostrar_produtos(){
        System.out.println(nome + ": " + "\n preço: " + preco + "\n quantidade: " + qtd);
    }
}
