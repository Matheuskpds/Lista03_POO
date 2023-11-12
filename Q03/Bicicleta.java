package Q03;

public class Bicicleta extends Veiculo{
    private int numeroRodas;
    private float velocidade;
    private boolean parar;

    public Bicicleta() {
        this.numeroRodas = 2;
        this.velocidade = 0;
        this.parar = false;
    }

    @Override
    public int getNumeroRodas() {
        return numeroRodas;
    }

    @Override
    public void acelerar(float velocidade) {
       this.velocidade = velocidade;
    }
    public float getVelocidade() {
        return velocidade;
    }

    @Override
    public void parar() {
        this.parar = true;
        this.velocidade = 0;
    }
    
}
