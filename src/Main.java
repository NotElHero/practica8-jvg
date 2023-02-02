public class Main {
    public static void main(String[] args) {
        Thread usuario1 = new Cuenta();
        Thread usuario2 = new Cuenta();

        usuario1.start();

        while (usuario1.isAlive()){
            try {
                usuario2.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        usuario2.start();

    }

}