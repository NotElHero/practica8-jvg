import java.util.ArrayList;

public class Cuenta extends Thread{
    static int SALDO = 50;
    ArrayList<String> usuarios = new ArrayList<>();

    public void run(){
        usuarios.add("Isabel");
        usuarios.add("Fernando");
        while (SALDO >= 0) {
            retirarDinero();
        }


    }
    public synchronized void retirarDinero(){
        for (int i = 0; i < usuarios.size(); i++){
            System.out.println(usuarios.get(i) + " va a retirar dinero");
            try {
                sleep(500);
                SALDO -= 10;
                System.out.println("Se han retirado 10€");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("SALDO ACTUAL: " + SALDO);

            if (i == usuarios.size()){
                i = 0;
            }
            notify();
        }

    }
}
