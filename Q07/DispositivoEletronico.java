package Q07;

abstract class DispositivoEletronico implements Ligavel {
    protected boolean ligado;

    public DispositivoEletronico() {
        this.ligado = false;
    }
}
