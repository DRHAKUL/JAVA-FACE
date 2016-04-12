/*
 Crear una aplicación para gestionar un videoclub. Cuenta con varios tipos de producto.
 • Todos los productos tienen:
 Referencia (Titulo, tipo(película/videojuego), precio alquiler, plazo alquiler (días), alquilado
 (si/no)
 • Película:
 Genero (acción, drama, aventuras, infantil), año, director, interpretes.
 • Videojuego:
 Estilo (accion, deportes, aventuras, puzle, infantil), plataforma (Xbox, playstation, wii)
 • Se mantiene un listado de clientes:
 Nº cliente, nombre, dirección, teléfono, productos alquilados
 • Se guarda un listado de registros de alquiler:
 Cliente, producto, fecha alquiler, fecha devolución, importe
 • Crear una aplicación de consola con el siguiente menú:
 • Lista productos
 • Añadir producto
 • Ficha producto
 • Lista clientes
 • Añadir cliente
 • Ficha cliente (incluye los productos que tiene alquilados)
 • Alquilar producto
 • Listado de registro de alquiler
 */
package videoclub;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Videoclub {

    ArrayList<Producto> listaProductos;
    ArrayList<Cliente> listaClientes;
    ArrayList<Registro> listaRegistros;
    ArrayList<Pelicula> listaPeliculas;
    ArrayList<Videojuego> listaVideojuegos;

    public Videoclub() {
        listaProductos = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaRegistros = new ArrayList<>();
        listaPeliculas = new ArrayList<>();
        listaVideojuegos = new ArrayList<>();
    }

    public class Producto {

        private String titulo;
        private double precioAlquiler;
        private int plazoAlquiler;
        private boolean alquilado;

        public Producto(String titulo, double precioAlquiler, int plazoAlquiler, boolean alquilado) {
            this.titulo = titulo;
            this.precioAlquiler = precioAlquiler;
            this.plazoAlquiler = plazoAlquiler;
            this.alquilado = alquilado;
        }

        public String getTitulo() {
            return titulo;
        }

        public double getPrecioAlquiler() {
            return precioAlquiler;
        }

        public int getPlazoAlquiler() {
            return plazoAlquiler;
        }

        public boolean isAlquilado() {
            return alquilado;
        }

        @Override
        public String toString() {
            return "Producto{" + "titulo=" + titulo + ", precioAlquiler=" + precioAlquiler + ", plazoAlquiler=" + plazoAlquiler + ", alquilado=" + alquilado + '}';
        }
        

    }

    public class Pelicula {

        private Genero genere;
        private Date anyo;
        private String director;
        private String interpretes;

        public Pelicula(Genero genere, Date anyo, String director, String interpretes) {
            this.genere = genere;
            this.anyo = anyo;
            this.director = director;
            this.interpretes = interpretes;
        }

    }

    public class Videojuego {

        private Estilo estil;
        private Plataforma plat;

        public Videojuego(Estilo estil, Plataforma plat) {
            this.estil = estil;
            this.plat = plat;
        }

    }

    public enum Genero {

        ACCION, FANTASTICA, DRAMA, AVENTURAS, PUZZLE, INFANTIL;
    }

    public enum Estilo {

        ACCION, DEPORTE, AVENTURAS, PUZZLE, INFANTIL;
    }

    public enum Plataforma {

        XBOX, PLAYSTATION, WII;
    }

    public class Cliente {

        private int numeroCliente;
        private String nombre;
        private String direccion;
        private String telefono;

        public Cliente(int numeroCliente, String nombre, String direccion, String telefono) {
            this.numeroCliente = numeroCliente;
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "Cliente{" + "numeroCliente=" + numeroCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
        }

    }

    public class Registro {

        private Cliente regClien;
        private Producto regPro;
        private Date fechaAlquiler;
        private Date fechaDevolucion;
        private double importe;

        public Registro(Cliente regClien, Producto regPro, Date fechaAlquiler, Date fechaDevolucion, double importe) {
            this.regClien = regClien;
            this.regPro = regPro;
            this.fechaAlquiler = fechaAlquiler;
            this.fechaDevolucion = fechaDevolucion;
            this.importe = importe;

        }

        public Cliente getRegClien() {
            return regClien;
        }

        public Producto getRegPro() {
            return regPro;
        }

        public Date getFechaAlquiler() {
            return fechaAlquiler;
        }

        public Date getFechaDevolucion() {
            return fechaDevolucion;
        }

        public double getImporte() {
            return importe;
        }
        
        @Override
        public String toString() {
            return "Registro{" + "regClien=" + regClien + ", regPro=" + regPro + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", importe=" + importe + '}';
        }

    }

    public void inicializar() {
        Cliente pepe = new Cliente(123, "Pepe", "C\flor 2", "4567865");
        Cliente pedro = new Cliente(124, "Pedro", "C\flor 4", "45888865");
        Pelicula peli1 = new Pelicula(Genero.ACCION, null, "Ford", "Tolo, Patrick");
        Pelicula peli2 = new Pelicula(Genero.FANTASTICA, null, "Francis", "Pedro, Patrick");
        Videojuego video1 = new Videojuego(Estilo.ACCION, Plataforma.XBOX);
        Videojuego video2 = new Videojuego(Estilo.DEPORTE, Plataforma.PLAYSTATION);
        Producto pro1 = new Producto("DMC", 23, 22, true);
        Producto pro2 = new Producto("PES2017", 45, 21, false);
        listaProductos.add(pro1);
        listaProductos.add(pro2);
        listaClientes.add(pepe);
        listaClientes.add(pedro);
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaPeliculas.add(peli1);
        listaPeliculas.add(peli2);

    }

    public void añadirProducto(Producto p) {
        listaProductos.add(p);
    }

    public void fichaProducto(Producto p) {
        System.out.println(p.getTitulo() + " " + p.getPlazoAlquiler() + " " + p.getPrecioAlquiler());
    }

    public void listaClientes() {
        for (Cliente c : listaClientes) {
            System.out.println(c);

        }
    }

    public void anyadirCliente(Cliente c) {
        listaClientes.add(c);
    }

    public void fichaCliente(Cliente c) {
        System.out.println(c);
        for (Registro r : listaRegistros) {
            if(r.getRegClien().equals(c)){
                System.out.println(r.getRegPro()+" "+r.getFechaAlquiler()+" "+ r.getFechaDevolucion());
            }
        }
    }

    public void alquilarProducto(Cliente c, Producto p) {
        Registro nou = new Registro(c, p, null, null, 25);
    }

    public void listadoAlquiler() {
        for (Registro r : listaRegistros) {
            System.out.println(r);
        }

    }

    public static void main(String[] args) {
        int eleccion;
        Videoclub v = new Videoclub();
        v.inicializar();
        do {
            System.out.println("1 Añadir producto");
            System.out.println("2 Ficha producto");
            System.out.println("3 Lista clientes");
            System.out.println("4 Añadir cliente");
            System.out.println("5 Ficha cliente");
            System.out.println("6 Alquilar producto");
            System.out.println("7 Listado de registro de alquiler");
            System.out.println("8 Salir");

            Scanner teclado = new Scanner(System.in);
            System.out.println("Elige una opción");
            eleccion = teclado.nextInt();
        } while (eleccion != 8);

    }

}
