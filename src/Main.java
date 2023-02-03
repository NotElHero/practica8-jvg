public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Thread usuario1 = new Thread(cuenta);
        usuario1.start();
        Thread usuario2 = new Thread(cuenta);
        usuario2.start();
    }
}