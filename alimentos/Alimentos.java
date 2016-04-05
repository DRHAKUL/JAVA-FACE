/*
Crear una clase de nombre Alimento cuyos objetos representen alimentos. Éstos, serán
identificados por una descripción alfanumérica que representa el nombre y tendrán además los
atributos siguientes:
• Contenido en lípidos expresado en tanto por ciento.
• Contenido en hidratos de carbono expresado en tanto por ciento.
• Contenido en proteínas expresado en tanto por ciento.
• Si es o no de origen animal.
• Contenido en vitaminas en los código A alto, M medio y B bajo.
• Contenido en minerales expresado en los códigos A lato, M medio y B bajo.
La clase tiene dos constructores: uno que admite como argumentos el nombre del alimento, y otro
que admite todos los atributos.
La clase tiene los siguientes métodos:
• esDietetico retorna cierto si el alimento contiene menos del 20% de lípidos y el contenido
en vitaminas no es bajo.
• muestraAlimento retorna una descripción del alimento.
• calculaContenidoEnergetico retorna el contenido en calorías de un gramo de alimento,
considerando que un gramo de lípidos contiene 9.4 Kcal. Un gramo de proteínas contiene
5.3 y un gramo de hidratos de carbono contiene 4.1 Kcal.


• EsRecomendableParaDeportistas este método retorna cierto si el alimento cumple la
siguiente lista: proteínas 10-15%, lípidos: 30-35%, hidratos de carbono 55-65%
4. Crear una aplicación en la que se solicite al usuario los datos de un alimento, se genere un objeto
de la clase Alimento y se muestre los datos del alimento, el contenido energético, si es dietético y
recomendable para deportistas.
 */
package alimentos;

/**
 *
 * @author DRAKUL
 */
public class Alimentos {

    private String nombre;
    private int contenidoLipidos;
    private int contenidoHidratos;
    private int contenidoProteinas;
    private boolean origenAnimal;
    private String vitaminas, minerales;

    public Alimentos(String nombre) {
        this.nombre = nombre;
        contenidoLipidos = 0;
        contenidoHidratos = 0;
        contenidoProteinas = 0;
        origenAnimal = true;
        vitaminas = "";
        minerales = "";
    }

    public Alimentos(String nombre, int contenidoLipidos, int contenidoHidratos, int contenidoProteinas, boolean origenAnimal, String vitaminas, String minerales) {
        this.nombre = nombre;
        this.contenidoLipidos = contenidoLipidos;
        this.contenidoHidratos = contenidoHidratos;
        this.contenidoProteinas = contenidoProteinas;
        this.origenAnimal = origenAnimal;
        this.vitaminas = vitaminas;
        this.minerales = minerales;
    }

    public boolean esDietetico() {
        if (contenidoLipidos < 20 && (vitaminas.equals("A") || vitaminas.equals("B"))) {
            return true;
        } else {
            return false;
        }
    }

    public void muestraAlimento() {
        System.out.println(nombre);
        if (esDietetico()) {
            System.out.println("Es dietetico ");
        } else {
            System.out.println("No es dietetico");
        }
        if (EsRecomendableParaDeportistas()) {
            System.out.println("Es para deportistas");

        } else {
            System.out.println("No es para deportistas");

        }
    }

    public double calculaContenidoEnergetico() {
        double calorias = contenidoLipidos / 100 * 9.4 + contenidoProteinas / 100 * 5.3 + contenidoHidratos / 100 * 4.1;
        return calorias;
    }

    public boolean EsRecomendableParaDeportistas() {
        if ((contenidoProteinas >= 10 && contenidoProteinas <= 15) && (contenidoLipidos >= 30 && contenidoLipidos <= 35) && (contenidoHidratos >= 55 && contenidoHidratos <= 65)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Alimentos b = new Alimentos("nou");
        b.muestraAlimento();
    }

}
