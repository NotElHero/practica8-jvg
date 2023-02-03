import java.util.ArrayList;

public class Cuenta extends Thread {
    static int SALDO = 50;
    ArrayList<String> usuarios = new ArrayList<>();

    public void run() {
        usuarios.add("Isabel");
        usuarios.add("Fernando");
        System.out.println("SALDO INICIAL: " + SALDO);
        while (SALDO > 0) {
            retirarDinero();
        }
    }

    public synchronized void retirarDinero() {
        for (int i = 0; i < usuarios.size(); i++) {
            if (SALDO == 0) {
                break;
            } else {
                if (i == usuarios.size()) {
                    i = 0;
                }
            }
            System.out.println(usuarios.get(i) + " va a retirar dinero");
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

}
