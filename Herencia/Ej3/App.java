package Herencia.Ej3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ListaMultimedia list = new ListaMultimedia(10);
        // Scanner scan = new Scanner(System.in);
        String titulo = "Rocky IV";
        Pelicula p = new Pelicula(titulo, null, null, 0, null, null);
        list.add(p);

        System.out.println(list.indexOf(p));
        System.out.println(p.toString());

        

    }

}
