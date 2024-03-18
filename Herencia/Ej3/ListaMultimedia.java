package Herencia.Ej3;

public class ListaMultimedia {

    // Atributos
    public Multimedia[] arrayMultimedia;
    public int contadorObjetos;

    // Constructor
    public ListaMultimedia(int numMaxObjetos) {
        arrayMultimedia = new Multimedia[numMaxObjetos];
    }

    // Getters & Setters

    // Metodos
    public int size() {
        int count = 0;
        for (Multimedia i : arrayMultimedia) {
            count++;
        }
        return count;
    }

    public boolean add(Multimedia m) {
        int index;
        for (int i = 0; i < arrayMultimedia.length; i++) {
            if (arrayMultimedia[i] == arrayMultimedia[size() - 1]) {

            }
            index = i; // saber en que posicion est

        }

        return true;
    }

    public Multimedia getObjeto(int posicion) {
        return arrayMultimedia[posicion];
    }

    public int indexOf(Multimedia m) {
        int posicion = -1;
        for (int i = 0; i < arrayMultimedia.length; i++) {
            if (arrayMultimedia[i] != m) {
                return -1;
            } else
                posicion = i;
        }

        return posicion;
    }

    public String toString() {
        return arrayMultimedia.toString();
    }
}