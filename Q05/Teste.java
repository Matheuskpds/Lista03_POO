package Q05;

public class Teste {
    public static void main(String[] args) {
        // Exemplo de uso
        Produto produto = new Produto(23);
        produto.setVolume(5);

        if (produto.testaUnidade()) {
            System.out.println("Produto aprovado!");
        } else {
            System.out.println("Produto reprovado!");
        }
        System.out.println(produto.toString());
    }
}
