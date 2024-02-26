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
 * 
 * // to-do
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
    private int x;
    private int y;
    private int distancia;

    // Constructor
    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters & Setters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    // Metodos
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public static void main(String[] args) {
        Punt[] arrayPunts = new Punt[4];
        arrayPunts[0] = new Punt(0, 0);
        arrayPunts[1] = new Punt(2, 0);
        arrayPunts[2] = new Punt(2, 2);
        arrayPunts[3] = new Punt(0, 2);

        for (Punt punt : arrayPunts) {
            System.out.println(punt.toString());
        }

        Poligono poli = new Poligono(arrayPunts);

        poli.escalar(4, -3);
        poli.mostrar();
        
    }
}

class Poligono {
    // Atributos
    Punt[] arrayPuntos;

    // Constructor
    public Poligono(Punt[] arrayPuntos) {
        this.arrayPuntos = arrayPuntos;
    }

    // Metodos
    public void trasladar(int pX, int pY) {
        for (Punt i : arrayPuntos) {
            i.setX(pX);
            i.setY(pY);
        }
    }

    public void escalar(int pX, int pY) {
        for (Punt punt : arrayPuntos) {
            punt.setX(punt.getX() + pX);
            punt.setY(punt.getY() + pY);
        }
    }

    public int numVertex() {
        int count = 0;
        for (Punt i : arrayPuntos) {
            count++;
        }
        return count;
    }

    public int perimetro() {
        return 0;
    }

    
    public void mostrar() {
        for (Punt punt : arrayPuntos) {
            System.out.println(punt);
        }
    }

}