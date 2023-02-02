public class Cuenta extends Thread{
    static int SALDO = 50;

    public void run(){
        retirarDinero();
    }
    public void retirarDinero(){
        System.out.println(" va a retirar dinero");
        SALDO -= 10;
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SALDO ACTUAL: " + SALDO);
    }
}
