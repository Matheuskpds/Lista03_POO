package Q06;

public class Papel implements Objeto {
    @Override
    public String getNome() {
        return "Papel";
    }

    @Override
    public boolean ganhaDe(Objeto outro) {
        return outro instanceof Pedra;
    }
} 