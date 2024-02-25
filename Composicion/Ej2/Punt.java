package Composicion.Ej2;

/**
 * 2.a.
 * Escrib una clas Punt() que contnga los siguientes metodos:
 * a) El constructor y los metodos
 * getX(), getY(), setX(), setY() i distància()
 * 
 * b) Un mètode toString() que devuelva la informacion del Punt
 * de la siguinent forma: (x,y).
 */

/**
 * 2.b.
 * Utilizando la clase Punto del ejercicio anterior, escribe una clase Polígono.
 *
 * Esta clase tiene como atributo un array de objetos Punt.
 * Se consideran adyacentes los objetos Punto que estén
 * en celdas consecutivas del array y los puntos que están
 * en la primera y última celda.
 * 
 * Esta clase debe tener los siguientes métodos:
 * a) El constructor, recibirá por parámetro un array con los objetos Punto
 * que definen el Polígono.
 * b) trasladar(), recibe por parámetro el desplazamiento en la coordenada 'x' y
 * el desplazamiento en la coordenada 'y'.
 * c) escalar(), recibe por parámetro el factor de escala para la coordenada 'x'
 * y el factor de escala para la coordenada 'y'.
 * d) numVertex(), devuelve el número de vértices del Polígono.
 * e) toString(), devuelve la información de los puntos del Polígono,
 * uno en cada línea.
 * f) perímetro(). Devuelve el perímetro del polígono.
 */

/**
 * 2.c.
 * Escribe una aplicación en la que:
 * a) Cruza un Polígono de cuatro vértices, que serán
 * (0,0), (2,0), (2,2) y (0,2).
 * b) Muestra la información del polígono y su perímetro por pantalla.
 * c) Trasladar el polígono 4 al eje x y -3 al eje y.
 * d) Muestra la información del polígono por pantalla.
 */
public class Punt {

    // Atributos
    private double x;
    private double y;
    private double distancia;

    // Constructor
    public Punt(double x, double y, double distancia) {
        this.x = x;
        this.y = y;
        this.distancia = distancia;
    }

    // Getters & Setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Metodos
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
