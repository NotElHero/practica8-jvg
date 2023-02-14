public class Usuario extends Thread{
    int cantidadRetirada;
    public Usuario(int cantidadRetirada) {
        this.cantidadRetirada = cantidadRetirada;
    }
    public void run() {
        Thread cuenta = new Cuenta(cantidadRetirada);
        cuenta.start();
    }
}
