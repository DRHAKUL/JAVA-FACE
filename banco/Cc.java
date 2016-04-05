package banco;

public class Cc extends Cuenta {

    public Cc(int numeroCuenta) {
        super(numeroCuenta);
        interes = 0.1;
        comision = 0.6;

    }

}
