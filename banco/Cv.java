/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author DRAKUL
 */
public class Cv extends Cuenta {

    public Cv(int numeroCuenta) {
        super(numeroCuenta);
        interes = 0.2;


    }
    public void sacarDinero(double dinero) {
       
            System.out.println("No se puede sacar dinero");
       
    }

}
