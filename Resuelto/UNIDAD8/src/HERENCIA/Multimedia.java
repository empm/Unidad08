/*
 3.a.- Escribe una clase Multimedia para almacenar información de objetos de tipo multimedia
 * (películas, discos, mp3...). Esta clase contiene título, autor, formato y duración como atributos. 
 * El formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. 
 * El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto. 
 * Esta clase tiene, además, un método para devolver cada uno de los atributos y un método toString() 
 * que devuelve la información del objeto. Por último un método equals() que recibe un objeto de 
 * tipo Multimedia y devuelve true en caso de que el título y el autor sean iguales a los del 
 * objeto que llama al método y false en caso contrario.
 */
package HERENCIA;

public class Multimedia {

    protected String titulo, autor, duracion;
    protected String formato;

    public Multimedia(String titulo, String autor, String formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

   
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: "
                + formato + "\nDuración: " + duracion + "\n";
    }

    public boolean equals(Multimedia m) {
        boolean igual;

        /*igual = m.getTitulo().equalsIgnoreCase(this.titulo) && 
         m.getAutor().equalsIgnoreCase(this.autor);*/
        igual = m.titulo.equalsIgnoreCase(this.titulo)
                && m.autor.equalsIgnoreCase(this.autor);

        return igual;
    }
}
