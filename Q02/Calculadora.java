package Q02;

/*Crie uma classe Calculadora. Essa classe deve implementar as operações básicas
(soma, subtração, divisão e multiplicação) entre dois números. Utilizando o
conceito de herança, crie uma calculadora científica que implemente os seguintes
cálculos: raiz quadrada e potência. Dica: utilize a classe Math do pacote
java.lang. Crie uma classe de teste para utilizar os dois tipos de calculadoras
para realização dos cálculos oferecidos*/

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //métodos getters e setters:
    public double getNum1() {
        return num1;
    }
    public void setNum1(double n1) {
        num1 = n1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double n2) {
        num2 = n2;
    }

    //métodos de operações básicas:
    public double soma() {
        return num1 + num2;
    }
    public double subtracao() {
        return num1 - num2;
    }
    public double divisao() {
        return num1 / num2;
    }
    public double multiplicacao() {
        return num1 * num2;
    }
}
