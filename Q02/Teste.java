package Q02;

public class Teste {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora(4, 2);
        System.out.println(c1.soma());
        System.out.println(c1.subtracao());
        System.out.println(c1.multiplicacao());
        System.out.println(c1.divisao());
        CalculadoraCientifica c = new CalculadoraCientifica(4, 2);
        System.out.println(c.soma());
        System.out.println(c.subtracao());
        System.out.println(c.multiplicacao());
        System.out.println(c.divisao());
        System.out.println(c.raizQuadrada());
        System.out.println(c.potencia());
    }
}
