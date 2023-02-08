public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        Thread usuario1 = new Usuario(cuenta.retirarDinero(10));
        usuario1.start();
        Thread usuario2 = new Usuario(cuenta.retirarDinero(10));
        usuario2.start();
    }
}