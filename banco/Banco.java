/*
 Este ejercicio trata de modelar un banco.
 El banco tiene una lista de cuentas y una lista de clientes.
 De los clientes tenemos su DNI, nombre, apellidos, dirección y teléfono.
 En cada cuenta podemos ingresar dinero, sacar dinero, consultar saldo, y efectuar una revisión
 mensual.
 • La revisión mensual de la cuenta calcula el saldo según la siguiente fórmula:
 saldo = saldo + interes_cuenta – comision (0,6 euros mensuales, que pueden modificarse)
 • Hay tres tipos de cuenta: CuentaCorriente (CC), CuentaVivienda (CV) y FondoInversion
 (FI).
 ➢ La CC tiene un interés mensual del 0.1%, la CV del 0.2% y el FI de un 0.34%.
 ➢ De la CC no se puede sacar más dinero del que hay, del FI se pueden tener hasta 500€
 en números rojos y de la CV no se puede sacar dinero.
 ➢ La revisión mensual de la CV no paga comisión bancaria.
 Implementar el modelo del banco en Java, y probar la funcionalidad de las clases.
 1 – Diseñar el modelo de clases y objetos que se van a usar, con sus atributos y métodos. Para los
 tipos de cuenta usar la herencia.
 2 – Implementar cada una de las clases.

 */
package banco;

import java.util.ArrayList;

public class Banco {
    
    ArrayList<Cliente> clientes;
    ArrayList<Cuenta> cuentas;
    
    public Banco() {
        clientes = new ArrayList<>();
        cuentas = new ArrayList<>();
    }
    
    public void puebas() {
        Cliente uno = new Cliente("Juan", "434444444", "C/Rosa 2", "6667777888");
        clientes.add(uno);
        Cc cuentaCc = new Cc(121242);
        cuentas.add(cuentaCc);
        Fi cuentaFi = new Fi(8979879);
        cuentas.add(cuentaFi);
        uno.anyadirCuenta(cuentaCc);
        uno.anyadirCuenta(cuentaFi);
        //ingresarDinero(uno, cuentaCc, 4000);
        //sacarDinero(cuentaCc, 2000);
        Cv cuenCv = new Cv(223344);
        cuentas.add(cuenCv);
        uno.anyadirCuenta(cuenCv);
        cuentaFi.sacarDinero(400);
        ingresarDinero(uno, cuenCv, 5500);
        ingresarDinero(uno, cuentaFi, 10500);
        cuenCv.sacarDinero(1000);
        //cuenCv.revisionMensual();
    }
    
    public void ingresarDinero(Cliente cl, Cuenta c, double dinero) {
        for (Cliente ci : clientes) {
            if (ci.equals(cl)) {
                ArrayList<Cuenta> cu = cl.accederCuentas();
                for (int i = 0; i < cu.size(); i++) {
                    if (cu.get(i).equals(c)) {
                        c.añadirSaldo(dinero);
                        c.verSaldo();
                        
                    }
                }
                
            }
        }
        
    }
    
    public void sacarDinero(Cuenta c, double dinero) {
        c.sacarDinero(dinero);
    }
    
    public static void main(String[] args) {
        Banco b = new Banco();
        b.puebas();
        
    }
    
}
