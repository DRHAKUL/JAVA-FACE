package banco;

public class Cuenta {

    protected double saldo;
    protected int numeroCuenta;
    protected double interes;
    protected double comision;

    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        interes = 0;
        comision = 0;
        saldo = 0;

    }

    public void añadirSaldo(double dinero) {
        saldo = saldo + dinero;
                System.out.println("Nuevo saldo cuenta "+ numeroCuenta+" " + saldo);

    }

    public void verSaldo() {
        System.out.println("Su saldo = " + saldo);

    }

    public void sacarDinero(double dinero) {
        if (saldo - dinero >= 0) {
            saldo = saldo - dinero;
            System.out.println("Nuevo saldo = " + saldo);
        } else {
            System.out.println("No hay suficiente saldo");
        }
    }

    public void consultarSaldo() {
        System.out.println(saldo);
    }

    public void revisionMensual() {
        saldo = saldo + (saldo*interes/100) - comision;
        System.out.println("Nuevo saldo cuenta "+ numeroCuenta+" " + saldo);

    }

}
