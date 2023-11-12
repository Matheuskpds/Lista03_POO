package Q04;

class Quadrado extends Retangulo {
    Quadrado(float lado) {
        super(lado, lado);
    }

    @Override
    String getTipo() {
        return "Quadrado";
    }
}
