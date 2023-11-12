package Q04;

class Circulo extends Forma {
    private float raio;

    Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    String getTipo() {
        return "Circulo";
    }

    @Override
    String requisitaDados() {
        return "Informe o raio do círculo: ";
    }
}
