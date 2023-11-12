package Q06;

class Pedra implements Objeto {
    @Override
    public String getNome() {
        return "Pedra";
    }

    @Override
    public boolean ganhaDe(Objeto outro) {
        return outro instanceof Tesoura;
    }
}
