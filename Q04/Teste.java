package Q04;
import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Teste com formas predefinidas
        formas.add(new Retangulo(5, 10));
        formas.add(new Circulo(3));
        formas.add(new Quadrado(4));

        System.out.println("Calculando áreas e perímetros das formas predefinidas:");
        for (Forma forma : formas) {
            System.out.println("Tipo: " + forma.getTipo());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("---------------");
        }

        // Teste com formas criadas pelo usuário
        System.out.println("Criar formas pelo usuário:");
        while (true) {
            System.out.println("Escolha o tipo de forma (Retangulo, Circulo, Quadrado) ou 'sair' para encerrar:");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("sair")) {
                break;
            }

            Forma novaForma = criarForma(escolha);
            if (novaForma != null) {
                formas.add(novaForma);
            }
        }

        System.out.println("Calculando áreas e perímetros das formas criadas pelo usuário:");
        for (Forma forma : formas) {
            System.out.println("Tipo: " + forma.getTipo());
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println("---------------");
        }
    }

    private static Forma criarForma(String tipo) {
        Scanner scanner = new Scanner(System.in);
        Forma novaForma = null;

        switch (tipo.toLowerCase()) {
            case "retangulo":
                System.out.println("Criando um retângulo.");
                System.out.print("Informe o lado e a altura (separados por espaço): ");
                String[] dadosRetangulo = scanner.nextLine().split(" ");
                if (dadosRetangulo.length == 2) {
                    novaForma = new Retangulo(Float.parseFloat(dadosRetangulo[0]), Float.parseFloat(dadosRetangulo[1]));
                }
                break;
            case "circulo":
                System.out.println("Criando um círculo.");
                System.out.print("Informe o raio do círculo: ");
                float raioCirculo = scanner.nextFloat();
                novaForma = new Circulo(raioCirculo);
                break;
            case "quadrado":
                System.out.println("Criando um quadrado.");
                System.out.print("Informe o lado do quadrado: ");
                float ladoQuadrado = scanner.nextFloat();
                novaForma = new Quadrado(ladoQuadrado);
                break;
            default:
                System.out.println("Tipo de forma inválido.");
        }

        return novaForma;
    }
}