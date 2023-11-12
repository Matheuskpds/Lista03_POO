package Q07;

public class Celular extends DispositivoEletronico implements Recarregavel {

    public Celular() {
        super();
    }

    @Override
    public void ligar() {
        if (!ligado) {
            System.out.println("Celular ligado.");
            ligado = true;
        } else {
            System.out.println("O celular ja esta ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            System.out.println("Celular desligado.");
            ligado = false;
        } else {
            System.out.println("O celular já está desligado.");
        }
    }

    @Override
    public void recarregar() {
        System.out.println("Celular sendo recarregado.");
        // Lógica para recarregar o celular
    }
}
