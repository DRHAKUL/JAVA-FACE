/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

public class Fi extends Cuenta {

    public Fi(int numeroCuenta) {
        super(numeroCuenta);
        interes = 0.34;
        comision = 0.6;
    }
    public void sacarDinero(double dinero) {
        if (saldo - dinero >= -500) {
            saldo = saldo - dinero;
            System.out.println("Nuevo saldo = " + saldo);
        } else {
            System.out.println("No hay suficiente saldo");
        }
    }

}
