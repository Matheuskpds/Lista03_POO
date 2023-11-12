package Q06;

class Tesoura implements Objeto {
    @Override
    public String getNome() {
        return "Tesoura";
    }

    @Override
    public boolean ganhaDe(Objeto outro) {
        return outro instanceof Papel;
    }
}