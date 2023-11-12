package Q01;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String n, float p, String r) {
        super(n, p);
        raca = r;
    }

    //métodos getters e setters:
    public String getRaca() {
        return raca;
    }
    public void setRaca(String r) {
        raca = r;
    }

    @Override
    public String toString() {
        return "nome:" + getNome() + ", peso:" + getPeso() + ", raca:" + raca;
    }
}
