package Q03;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Automovel extends Veiculo{

    private int numeroRodas;
    private float velocidade;
    private boolean parar;
    private String dataTrocaOleo;

    public Automovel(int numeroRodas) {
        this.numeroRodas = numeroRodas;
        this.velocidade = 0;
        this.parar = false;
        this.dataTrocaOleo = "00/00/0000";
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

    public String getDataTrocaOleo() {
        return dataTrocaOleo;
    }

    public void trocaOleo() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataTrocaOleo = currentDate.format(formatter);
    }
    
}
