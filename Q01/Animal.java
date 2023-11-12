package Q01;

public abstract class Animal {
    private String nome;
    private double peso;

    public Animal(String n, double p) {
        nome = n;
        peso = p;
    }

    //métodos getters e setters:
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double p) {
        peso = p;
    }
}