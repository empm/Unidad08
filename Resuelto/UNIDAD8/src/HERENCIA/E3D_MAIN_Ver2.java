/*
 3.d.- Escribe una aplicación donde: 
 */
package HERENCIA;

import java.io.IOException;
import java.util.Scanner;

public class E3D_MAIN_Ver2 {

    public static void main(String[] args) throws IOException {

        //  a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.
        ListaMultimedia listaUno = new ListaMultimedia(10);
        Scanner teclado = new Scanner(System.in);
        double a1 = 0;

        //b) Se pidan tres películas y se añadan a la lista. 
        for (int i = 1; i <= 3; i++) {

            System.out.println("-- PELICULA " + i + ": --");
            System.out.print("\nTítulo: ");
            String ti = teclado.nextLine();
            System.out.print("Director: ");
            String di = teclado.nextLine();
            System.out.print("Actor principal: ");
            String ar = teclado.nextLine();
            System.out.print("Actriz principal: ");
            String az = teclado.nextLine();
            System.out.print("Duracion: ");
            String dur = teclado.nextLine();
            System.out.print("Formato: ");
            System.out.print("( wav, mp3, midi, avi, mov, mpg, cdAudio, dvd  : ");
            String format = teclado.nextLine();

            try {
                listaUno.add(new Pelicula(ti, di, format, dur, ar, az));
            } catch (IOException e) {
                System.out.println("-- CASILLA ACTOR O ACTRIZ VACIA -- ");
                i--;
            }
        }
        //c) Se muestre la lista por pantalla.
        System.out.println(listaUno);
        //d) Se cree un objeto de tipo Película introduciendo el título y el autor de una de las películas de la lista (o no).
        //* Para el resto de los argumentos se utilizan valores no significativos.
        try {
            //mejor preguntar titulo y autor al usuario
            Pelicula prueba = new Pelicula("Batman Begins", "Bruce Wayne", "no se", "no se", "no importa", "uno puede ser null");
           
            //e) Busca la posición de este objeto en la lista.
            int pos = listaUno.indexOf(prueba);

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
            System.out.println("Posicion: " + pos);
            if (pos != -1) {
                System.out.println(listaUno.get(pos));
            }

        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error en la busqueada de un elemento de la lista ");
        }
    }
}
