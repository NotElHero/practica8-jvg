public class Cuenta {
    int saldo = 50;

    public int retirarDinero(int dineroRetirado) {
        System.out.println(" va a retirar dinero");
        saldo -= dineroRetirado;
        System.out.println("Se han retirado 10€");
        System.out.println("saldo ACTUAL: " + saldo);
        return saldo;
    }
}