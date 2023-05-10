public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua A", 123, "São Paulo", "SP");
        Pessoa pessoa1 = new Pessoa("João", 30, endereco1);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Rua: " + pessoa1.getEndereco().getRua());
        System.out.println("Número: " + pessoa1.getEndereco().getNumero());
        System.out.println("Cidade: " + pessoa1.getEndereco().getCidade());
        System.out.println("Estado: " + pessoa1.getEndereco().getEstado());

        Endereco endereco2 = new Endereco("Rua B", 456, "Rio de Janeiro", "RJ");
        pessoa1.setEndereco(endereco2);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Rua: " + pessoa1.getEndereco().getRua());
        System.out.println("Número: " + pessoa1.getEndereco().getNumero());
        System.out.println("Cidade: " + pessoa1.getEndereco().getCidade());
        System.out.println("Estado: " + pessoa1.getEndereco().getEstado());
    }
}