package Herencia.Ej3;

/**
 * 3.a.
 * Escriu una classe Multimèdia per a emmagatzemar informació d'objectes
 * de tipus multimèdia (pel·lícules, discos, mp3...). 
 * 
 * Aquesta classe conté títol, autor, format i duració com a atributs. 
 * El format pot ser un dels següents:
 * wav,mp3, midi, avi, mov, mp4, cdAudio i dvd. 
 * 
 * El valor de tots els atributs es passa per paràmetre 
 * en el moment de crear l'objecte. 
 * 
 * Aquesta classe té, a més, un mètode per a retornar 
 * cadascun dels atributs i un mètode toString() 
 * que retorna la informació de l'objecte. 
 * 
 * Finalment un mètode equals() que rep un objecte de tipus Multimèdia 
 * i retorna true en cas que el títol i l'autor siguen iguals
 * als de l'objecte que anomena al mètode i false en cas contrari.
 */

/**
 * 3.b.
 * Escriu una classe Pel·lícula que herete de la classe Multimèdia
 * 
 * La classe Pel·lícula té, a més dels atributs heretats, 
 * un actor principal i una actriu principal. 
 * Es permet que un dels dos siga nul, però no els dos. 
 * 
 * La classe ha de tindre dos mètodes per a obtindre els dos nous atributs 
 * i ha de sobreescriure el mètode toString() perquè retorne, 
 * a més de la informació heretada, la nova informació.
 * 
 */

/**
 * 3.c.
 * Escriu una classe ListaMultimedia per a emmagatzemar objectes de tipus multimèdia.
 * 
 * La classe ha de tindre un atribut que siga un array d'objectes Multimèdia 
 * i un enter per a comptar quants objectes hi ha emmagatzemats. 
 * 
 * A més, té un constructor i els següents mètodes:
 * a) el constructor rep per paràmetre un enter indicant el nombre màxim
 * d'objectes que emmagatzemarà.
 * b) int size(): retorna el nombre d'objectes que hi ha en la llista.
 * c) boolean add( Multimèdia m): afig l'objecte al final de la llista i retorna
 * true, en cas que la llista estiga plena retornarà false.
 * d) Multimèdia get( int posició): retorna l'objecte situat en la posició
 * especificada.
 * e) int indexOf( Multimèdia m): retorna la posició de l'objecte que
 * s'introdueix per paràmetre, si no es troba, retornarà -1.
 * f) String toString( ) retorna la informació dels objectes que estan en la
 * llista.
 */

/**
 * 3.d.
 * Escriu una aplicació on:
 * a) Es crea un objecte de tipus ListaMultimedia de grandària màxima 10.
 * b) Es demanen tres pel·lícules i s'afigen a la llista.
 * c) Es mostre la llista per pantalla.
 * d) Es creua un objecte de tipus Pel·lícula introduint el títol i l'autor
 * d'una de les pel·lícules de la llista.
 * Per a la resta dels arguments s'utilitzen valors no significatius.
 * e) Cerca la posició d'aquest objecte en la llista.
 * f) Obtinga l'objecte que està en aqueixa posició i el mostre per pantalla
 * juntament amb la posició en la qual es troba.
 */

/**
 * 3.f.
 * Escriu una classe Disc que herete de la classe Multimèdia ja realitzada. 
 * La classe Disc té, a part dels elements heretats, un atribut per a emmagatzemar
 * el gènere al qual pertany (rock, pop, punk, etc.). 
 * 
 * La classe ha de tindre un mètode per a obtindre el nou atribut 
 * i ha de sobreescriure el mètode toString() perquè retorne, 
 * a més de la informació heretada, la nova informació.
 */

/**
 * 3.g.
 * Escriu una aplicació on:
 * a) Es creua un objecte de tipus ListaMultimedia de grandària màxima 10.
 * b) Es creuen tres discos i s'afigen a la llista.
 * c) Es mostre la llista per pantalla.
 * d) Es creu un objecte de tipus Disc introduint el títol i l'autor d'un dels
 * discos de la llista, per a la resta dels arguments s'utilitzen valors no
 * significatius.
 * e) Cerca la posició d'aquest objecte en la llista.
 * f) Obtinga l'objecte que està en aqueixa posició i el mostre per pantalla
 * juntament amb la posició en la qual es troba.
 */
public class Multimedia {

    // Atributos
    protected String titulo;
    protected String autor;
    protected Format formato;
    protected double duracion;

    // Constructor
    public Multimedia(String titulo, String autor, Format formato, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    // Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Format getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }

    // Metodos
    @Override
    public String toString() {
        return "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nFormato: " + this.formato +
                "\nDuracion: " + this.duracion;
    }

    /*
     * Finalment un mètode equals() que rep un objecte de tipus Multimèdia
     * i retorna true en cas que el títol i l'autor siguen iguals
     * als de l'objecte que anomena al mètode i false en cas contrari.
     */

    public boolean equals(Multimedia m) {
        if (titulo.equalsIgnoreCase(m.autor))
            return true;
        else
            return false;
    }

}

enum Format {
    // wav,mp3, midi, avi, mov, mp4, cdAudio i dvd.
    WAV,
    MP3,
    MIDI,
    AVI,
    MOV,
    MP4,
    CDAUDIO,
    DVD;
}

class Pelicula extends Multimedia {

    // Atributos
    protected String actorPrincipal;
    protected String actrizPrincipal;

    // Constructor
    public Pelicula(String titulo, String autor, Format formato, double duracion, String actorPrincipal,
            String actrizPrincipal) {
        super(titulo, autor, formato, duracion);

        if (actorPrincipal == null && actrizPrincipal == null) {
            this.actorPrincipal = "Actor por defecto";
            this.actrizPrincipal = "Actriz por defecto";
        } else {
            this.actorPrincipal = actorPrincipal;
            this.actrizPrincipal = actrizPrincipal;
        }
    }

    // Getters & Setters
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    // Metodos
    @Override
    public String toString() {
        return super.toString() + "\nActor principal: " + this.actorPrincipal +
                "\nActriz principal: " + this.actrizPrincipal;
    }
}

class ListaMultimedia {

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