/*
 3.d.- Escribe una aplicación donde: 
 */

package HERENCIA;

public class E3D_MAIN {

    public static void main(String[] args) {
        //  a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10.
        ListaMultimedia listaMulti = new ListaMultimedia(10);

//b) Se pidan tres películas y se añadan a la lista. 

        //Creo 3 peliculas
        try {
            Pelicula Batman = new Pelicula("Batman Begins", "Bruce Wayne",
                    "mp3", "124", "aaaaa", "");
            Pelicula Superman = new Pelicula("Superman Returns", "Steven Spielberg",
                    "wav", "132", "Richard Gere", "Jennifer Anniston");
            Pelicula Torrente = new Pelicula("Torrente", "Santiago Segura",
                    "dvd", "96", "Santiago Segura", "Neus Asensi");

            //Añado a la lista    
            listaMulti.add(Batman);
            listaMulti.add(Superman);
            listaMulti.add(Torrente);


        } catch (Exception x) {
            System.out.println("Datos incorrectos....Error en la creación de la Lista");
        }
//c) Se muestre la lista por pantalla.
        System.out.println(listaMulti);

//d) Se cree un objeto de tipo Película introduciendo el título y el autor de una de las películas de la lista.
        //* Para el resto de los argumentos se utilizan valores no significativos.
        try {

            Pelicula prueba = new Pelicula("Batman Begins", "Bruce Wayne", null, null, "no importa", "uno puede ser null");
//e) Busca la posición de este objeto en la lista.
            int pos = listaMulti.indexOf(prueba);

// f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
            System.out.println("Posicion: " + pos);
            if (pos != -1) {
                System.out.println(   listaMulti.get(pos)  );
            }

        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error en la busqueada de un elemento de la lista ");
        }
        //Al ejecutar no deja crear si metemos los valores a null ya que en el constructor de la clase multimedia
        // he hecho las comprobaciones pertinentes.
    }
}
