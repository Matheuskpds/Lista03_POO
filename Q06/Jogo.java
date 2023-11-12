package Q06;
import java.util.Random;

class Jogo {
    private Objeto escolherObjetoAleatorio() {
        Random random = new Random();
        int escolha = random.nextInt(3); // 0: Papel, 1: Pedra, 2: Tesoura

        switch (escolha) {
            case 0:
                return new Papel();
            case 1:
                return new Pedra();
            case 2:
                return new Tesoura();
            default:
                throw new IllegalStateException("Escolha inválida.");
        }
    }

    private void realizarJogo() {
        Objeto jogador1 = escolherObjetoAleatorio();
        Objeto jogador2 = escolherObjetoAleatorio();

        System.out.println("Jogador 1 escolheu: " + jogador1.getNome());
        System.out.println("Jogador 2 escolheu: " + jogador2.getNome());

        if (jogador1.ganhaDe(jogador2)) {
            System.out.println("Jogador 1 ganha!");
        } else if (jogador2.ganhaDe(jogador1)) {
            System.out.println("Jogador 2 ganha!");
        } else {
            System.out.println("Empate!");
        }

        System.out.println("--------------------");
    }

    public void jogar() {
        while (true) {
            realizarJogo();
            // Adicione lógica para continuar ou encerrar o jogo conforme necessário
        }
    }
}
