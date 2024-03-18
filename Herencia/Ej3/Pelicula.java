package Herencia.Ej3;

public class Pelicula extends Multimedia {

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