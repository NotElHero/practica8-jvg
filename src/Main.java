public class Main {
    public static void main(String[] args) {
        int cantidadRetirada = 10;

        Thread usuario1 = new Usuario(cantidadRetirada);
        Thread usuario2 = new Usuario(cantidadRetirada);
        usuario1.start();
        usuario2.start();
    }
}