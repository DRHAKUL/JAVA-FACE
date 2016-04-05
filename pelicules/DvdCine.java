/*
1. Crear una clase para datos de películas
• Escribe una clase que represente una película en DVD de nombre DVDCine con los atributos
necesarios para mostrar la ficha que se recoge en el apartado segundo. Esta clase contará con
un constructor que admite como argumentos todos los atributos de la clase.
• Escribe los siguientes métodos para la clase DVDCine:
• muestraDVDCine: Este método retorna una descripción completa de la película, por
ejemplo:
UN FINAL MADE IN HOLLYWOOD (HOLLYWOOD ENDING)
De: Woody Allen
Con: Woody Allen y George Hamilton
Comedia – 114 min.
Resumen: Los Oscars ganados en el pasado por el ex-genio del cine …
• esThriller: Este método retorna cierto (true), si la película pertenece a este género
cinematográfico.
• tieneResumen: Retorna cierto si la película tiene el resumen escrito.
• muestraDuracion: Retorna la duración con el formato: “114 min .”
• Escribir una aplicación que solicite los datos de una película, genere un objeto DVDCine y
muestre éste con el formato del apartado segundo. Probar también los métodos esThriller y
tieneResumen.
 */
package pelicules;



/**
 *
 * @author DRAKUL
 */
public class DvdCine {
    private String titulo;
    private String director;
    private String actores;
    private String genero;
    private int duracion;
    private String resumen;

    public DvdCine(String titulo, String director, String actores, String genero, int duracion, String resumen) {
        this.titulo = titulo;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }    
    public boolean esThriller(){
        if(genero.equals("Thriller")||genero.equals("THRILLER")||genero.equals("thriller")){
            return true;
        }else{
        return false;}
    }   
    public boolean tieneResumen(){
        if (resumen.equals("")){
            return false;
        }
        return true;
    }   
    public void muestraDuracion(){
        System.out.println(duracion +" min");
    }
      
    public static void main(String[] args) {
        
        DvdCine d = new DvdCine("UN FINAL MADE IN HOLLYWOOD","Woody Allen","Woody Allen y George Hamilton","Comedia",114,"Los Oscars ganados en el pasado por el ex-genio del cine …");          
        System.out.println(d.esThriller());
        System.out.println(d.tieneResumen());
       d.muestraDuracion();
    }
    
}
