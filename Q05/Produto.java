package Q05;
import java.util.Random;

public class Produto {
    private final int numeroSerial;
    private int volumeProduto;
    private String resultadoTeste;

    //Construtor
    public Produto(int numeroSerial) {
        this.numeroSerial = numeroSerial;
        this.volumeProduto = 0;
        this.resultadoTeste = "nao testado";
    }

    // Método para testar a unidade
    public boolean testaUnidade() {
        if (!resultadoTeste.equals("não testado")) {
            System.out.println("Este produto já foi testado.");
            return false;
        }

        Random random = new Random();
        boolean aprovado = random.nextDouble() < 0.9;

        if (aprovado) {
            resultadoTeste = "aprovado";
        } else {
            resultadoTeste = "reprovado";
        }

        return aprovado;
    }

    // Método para definir o volume
    public void setVolume(int volume) {
        this.volumeProduto = volume;
    }

    // Método toString para exibir informações sobre o produto
    @Override
    public String toString() {
        return "Número Serial: " + numeroSerial + "\nVolume: " + volumeProduto + "\nResultado do Teste: " + resultadoTeste;
    }
}
