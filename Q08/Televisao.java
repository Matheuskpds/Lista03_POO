package Q08;

public class Televisao extends Eletrodomestico implements AparelhoInteligente{
    private int volume;

    //Contrutor
    public Televisao(String nome) {
        super(nome);
        this.volume = 0;
    }

    //métodos adicionais
    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    //métodos getters
    public int getVolume() {
        return this.volume;
    }

    //métodos da interface
    @Override
    public void conectarWifi() {
        System.out.println("Conectando a rede wifi...");
    }
    @Override
    public void ligar() {
        if (!this.getEstado()) {
            System.out.println("Ligando a televisao...");
            this.setEstado(true);
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }
    @Override
    public void desligar() {
        if (this.getEstado()) {
            System.out.println("Desligando a televisao...");
            this.setEstado(false);
        } else {
            System.out.println("A televisao já está desligada.");
        }
    }
}
