/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

public class Cliente {

    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    ArrayList<Cuenta> cuentas;

    public Cliente(String dni, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void anyadirCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public ArrayList accederCuentas() {
        return cuentas;
    }
}
