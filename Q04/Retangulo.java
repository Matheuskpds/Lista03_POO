package Q04;

class Retangulo extends Forma {
    private float lado;
    private float altura;
    
    Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    float calcularArea() {
       return lado * altura;
    }
    
    @Override
    float calcularPerimetro() {
        return 2 * (lado + altura);
    }
    
    @Override
    String getTipo() {
        return "Retangulo";
    }
    
    @Override
    String requisitaDados() {
        return "Digite o lado e a altura do retângulo: ";
    }
}
