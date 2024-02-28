//Escribe una aplicación donde:
package POLIMORFISMO;

import HERENCIA.*;

public class E5_MAIN {

    public static void main(String[] args) {
        //a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. 
        //* ListaMultimedia del Ejercicio 10.
        ListaMultimedia listaMulti = new ListaMultimedia(10);
      
        // b) Se creen tres discos y se añadan a la lista. Disco del Ejercicio 12.
        try {
            Disco Rihanna = new Disco("Diamonds", "Rihanna", "mp3", "4", "Pop");
            Disco MagodeOz = new Disco("Fiesta Pagana", "Mago de Oz", "mp3", "5", "Rock");
            Disco DavidGuetta = new Disco("The World is mine", "Davig Guetta", "mp3", "4", "Dance");

            //Añado a la lista    
            listaMulti.add(Rihanna);
            listaMulti.add(MagodeOz);
            listaMulti.add(DavidGuetta);

        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error al insertar discos en la ListaMultimedia");
        }

        //c) Se creen tres películas y se añadan a la lista. Película del Ejercicio 9
        try {
            Pelicula Batman = new Pelicula("Batman Begins", "Bruce Wayne", "mp3", "124", "Gerard Butler", "Jennifer Lawrence");
            Pelicula Superman = new Pelicula("Superman Returns", "Steven Spielberg", "wav", "132", "Richard Gere", "Jennifer Anniston");
            Pelicula Torrente = new Pelicula("Torrente", "Santiago Segura", "dvd", "96", "Santiago Segura", "");

            //Añado a la lista    
            listaMulti.add(Batman);
            listaMulti.add(Superman);
            listaMulti.add(Torrente);

        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error al insertar peliculas en la ListaMultimedia");
        }

        //   d) Trabajando con la lista y suponiendo que no se sabe en qué 
        //posiciones están los discos y las películas:
        //  1. Se muestre la lista por pantalla.
        System.out.println(listaMulti);
        
        //2. Se calcule la duración total de los objetos de la ListaMultimedia.
        int duracion_total = 0;

        //Método que convierte String en int -> Integer.parseInt()
        for (int i = 0; i < listaMulti.size(); i++) {
            duracion_total += Integer.parseInt(listaMulti.get(i).getDuracion());
        }
        System.out.println("Duracion total: " + duracion_total + " minutos. ");

        //3. Se muestre cuántos discos hay de rock.
        int discos_rock = 0;
        for (int i = 0; i < listaMulti.size(); i++) {
           if (listaMulti.get(i) instanceof Disco) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                if ( ((Disco)listaMulti.get(i)).getGenero().equalsIgnoreCase("Rock")) {
                    discos_rock++;
                }
            }
        }
        System.out.println("Discos de rock: " + discos_rock);

        //4. Se obtenga cuántas películas no tienen actriz principal.
        int act_princi = 0;
        for (int i = 0; i < listaMulti.size(); i++) {
            if (listaMulti.get(i) instanceof Pelicula) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                if (((Pelicula) listaMulti.get(i)).getActrizPrincipal().isEmpty()) {
                    act_princi++;
                }
            }
        }
        System.out.println("Peliculas sin actriz principal: " + act_princi);
    }
}
