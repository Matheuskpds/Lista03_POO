package Q02;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(int num1, int num2) {
        super(num1, num2);
    }
    public double raizQuadrada() {
        return Math.sqrt(getNum1());
    }
    public double potencia() {
        return Math.pow(getNum1(), getNum2());
    }
}
