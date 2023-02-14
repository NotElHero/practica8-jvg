import java.util.ArrayList;

public class Cuenta extends Thread {
    int saldo = 50;
    int cantidadRetirada, posicionUsuario = 0;
    ArrayList<String> usuariosPropietarios = new ArrayList<>();

    public Cuenta(int cantidadRetirada) {
        this.cantidadRetirada = cantidadRetirada;
    }

    public void run(){
        usuariosPropietarios.add("Isabel");
        usuariosPropietarios.add("Fernando");
        retirarDinero();
    }

    public int retirarDinero() {
        System.out.println(usuariosPropietarios.get(0) + " va a retirar dinero");
        saldo -= cantidadRetirada;
        System.out.println("Se han retirado 10€");
        System.out.println("saldo ACTUAL: " + saldo);

        posicionUsuario++;
        if (posicionUsuario == usuariosPropietarios.size()){
            posicionUsuario = 0;
        }
        return saldo;
    }

}