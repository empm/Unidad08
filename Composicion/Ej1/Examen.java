package Composicion.Ej1;

/**
 * 1.a.- Realitza una classe, de nom Examen, per a guardar informació sobre els
 * exàmens d'un centre educatiu.
 * 
 * La informació que es guarda d'un examen és:
 * el nom de l'assignatura,
 * l'aula,
 * la data i
 * l'hora.
 * 
 * Per a guardar la data i l'hora cal realitzar dues classes, Data i Hora.
 * 
 * La classe Data guarda dia, mes i any.
 * Tots els valors es reben en el constructor per paràmetre.
 * 
 * A més, aquesta classe ha de tindre un mètode que retorne
 * cadascun dels atributs i un mètode toString() que retorne la informació
 * de la data en forma de String.
 * 
 * La classe Hora guarda hora i minut.
 * També rep els valors per als atributs per paràmetre en el constructor,
 * té mètodes que retornen cadascun dels atributs i un mètode toString().
 * 
 * 
 * 1.b.- Realitza una aplicació que cree un objecte de tipus Examen,
 * el mostre per pantalla,
 * modifique la seua data i hora i ho torne a mostrar per pantalla
 */
public class Examen {

    private String nombre;
    private int aula;
    private Data data;
    private Hora hora;

    public Examen(String nombre, int aula, Data data, Hora hora) {
        this.nombre = nombre;
        this.aula = aula;
        this.data = data;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\nAula: " + this.aula +
                "\nData: " + this.data.toString() +
                "\nHora: " + this.hora.toString();
    }

    public static void main(String[] args) {
        Examen e1 = new Examen("Enrique", 301, new Data(19, 12, 2023), new Hora(20, 43));
        System.out.println(e1.toString());
        
        Data d = new Data(25, 02, 2024);
        e1.data = d;

        Hora h = new Hora(20, 48);
        e1.hora = h;
        
        System.out.println();
        System.out.println(e1.toString());

    }

}

class Data {
    // Atributos
    private int dia;
    private int mes;
    private int any;

    // Constructor
    public Data(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    // Getters & Setters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAny() {
        return this.any;
    }

    // Metodos
    @Override
    public String toString() {
        return this.dia + "-" + this.mes + "-" + this.any;
    }

}

class Hora {

    // Atributos
    private int hora;
    private int minut;

    // Constructor
    public Hora(int hora, int minut) {
        this.hora = hora;
        this.minut = minut;
    }

    // Getters & Setters
    public int getHora() {
        return hora;
    }

    public int getMinut() {
        return minut;
    }

    // Metodos
    @Override
    public String toString() {
        return this.hora + ":" + this.minut;
    }
}
