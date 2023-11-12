package Q01;

public class Peixe extends Animal{
    private String tipoHabitat;

    public Peixe(String n, double p, String t) {
        super(n, p);
        tipoHabitat = t;
    }

    //métodos getters e setters:
    public String getTipoHabitat() {
        return tipoHabitat;
    }
    public void setTipoHabitat(String t) {
        tipoHabitat = t;
    }


    @Override
    public String toString() {
        return "nome:" + getNome() + ", peso:" + getPeso() + ", tipoHabitat:" + tipoHabitat;
    }

}
