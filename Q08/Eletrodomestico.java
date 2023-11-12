package Q08;

public abstract class Eletrodomestico {
    private final String nome;
    private boolean estado; //estado: ligado/desligado(true/false)

    public Eletrodomestico(String nome) {
        this.nome = nome;
        this.estado = false;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
