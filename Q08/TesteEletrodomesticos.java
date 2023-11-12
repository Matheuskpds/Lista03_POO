package Q08;

public class TesteEletrodomesticos {
    public static void main(String[] args) {
        Televisao televisao = new Televisao("Televisao");
        televisao.ligar();
        System.out.println("Volume: " + televisao.getVolume());
        televisao.conectarWifi();
        televisao.aumentarVolume();
        System.out.println("Volume: +" + televisao.getVolume());
        televisao.diminuirVolume();
        System.out.println("Volume: -" + televisao.getVolume());
        televisao.desligar();
    }
}
