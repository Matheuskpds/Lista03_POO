package Q03;

public class Teste {
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta();
        System.out.println(b.getNumeroRodas());
        b.acelerar(10);
        System.out.println(b.getVelocidade());
        b.parar();
        System.out.println(b.getVelocidade());
        Automovel a = new Automovel(4);
        System.out.println(a.getNumeroRodas());
        a.acelerar(10);
        System.out.println(a.getVelocidade());
        a.parar();
        System.out.println(a.getVelocidade());
        a.trocaOleo();
        System.out.println(a.getDataTrocaOleo());
    }
}
