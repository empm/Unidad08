/*
 3.g.- Escribe una aplicación donde>
 */
package HERENCIA;

public class E3G_MAIN {

    public static void main(String[] args) {
        //a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. 
        ListaMultimedia listaDos = new ListaMultimedia(10);
        // b) Se creen tres discos y se añadan a la lista.

        try {
            //Creo 3 Discos
            Disco Rihanna = new Disco("Diamonds", "Rihanna", "mp3", "4", "Pop");
            Disco MagodeOz = new Disco("Fiesta Pagana", "Mago de Oz", "mp3", "5", "Rock");
            Disco DavidGuetta = new Disco("The World is mine", "Davig Guetta", "mp3", "4", "Dance");

            //Añado a la lista    
            listaDos.add(Rihanna);
            listaDos.add(MagodeOz);
            listaDos.add(DavidGuetta);

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
            // System.out.println("Posicion: " + ListaMultimedia.indexOf(Torrente));
            // System.out.println(ListaMultimedia.get(ListaMultimedia.indexOf(Torrente)));
        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error al crear la Lista");
        }

        //   * c) Se muestre la lista por pantalla. 
        System.out.println(listaDos);

        //d) Se cree un objeto de tipo Disco introduciendo el título y el autor de uno de los discos 
        //* de la lista, para el resto de los argumentos se utilizan valores no significativos. 
        try {
            Disco prueba = new Disco("Mendoza", "Prueba", null, null, null);
            listaDos.add(prueba);

            //e) Busca la posición de este objeto en la lista.
            int pos = listaDos.indexOf(prueba);
            System.out.println("****Posición: " + pos);

            // f) Obtenga el objeto que está en esa posición y lo muestre por pantalla 
            //junto con la posición en la que se encuentra.
            if (pos != -1) {
                System.out.println(listaDos.get(listaDos.indexOf(prueba)));
            } else {
                System.out.println("Disco no encontrado");
            }
        } catch (Exception x) {
            System.out.println("Datos incorrectos. Error en la busquedade un elemento");
        }

    }
}
