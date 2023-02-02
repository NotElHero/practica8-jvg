public class Main {
    public static void main(String[] args) {
        Thread usuario1 = new Cuenta();
        Thread usuario2 = new Cuenta();

        usuario1.start();

    }
}