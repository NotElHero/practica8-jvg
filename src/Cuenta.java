public class Cuenta extends Thread{
    static int SALDO = 50;

    public void run(){
        do {
            retirarDinero();
        } while (SALDO <= 0);

    }
    public synchronized void retirarDinero(){
        System.out.println(" va a retirar dinero");
        try {
            sleep(500);
            SALDO -= 10;
            System.out.println("Se han retirado 10€");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SALDO ACTUAL: " + SALDO);
        notify();
    }
}
