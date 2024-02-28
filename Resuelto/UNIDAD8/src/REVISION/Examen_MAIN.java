/*
 1.b.- Realiza una aplicación que cree un objeto de tipo Examen, lo muestre por
 * pantalla, modifique su fecha y hora y lo vuelva a mostrar por pantalla.
 */
package REVISION;

public class Examen_MAIN {

    public static void main(String[] args) {
        Fecha hoy = new Fecha(17, 4, 2013);
        Hora actual = new Hora(13, 47);

        Examen programacion = new Examen("Programacion", "6J", hoy, actual);
        actual = new Hora(17, 49);
        
        System.out.println(actual);
        System.out.println(programacion);
        
        //Al mostrar el objeto se llama por defecto al método toString
        // como lo hemos sobrecargado sale con el formato deseado
        System.out.println(programacion);
      
        //Modifico Hora
        //actual.setHora(12);
        //actual.setMinuto(22);
        //Mejor opción:
        programacion.getH().setHora(12);
        programacion.getH().setMinuto(22);
        System.out.println("=== MODIFICO HORA ===");
        System.out.println(programacion);
             
        //Modifico Fecha
        //hoy.setDia(1);
        //hoy.setMes(12);
        //hoy.setAnyo(1987);
        //Mejor opción:
        programacion.getFecha().setDia(1);
        programacion.getFecha().setMes(12);
        programacion.getFecha().setAnyo(1987);
        System.out.println("=== MODIFICO FECHA ===");
        System.out.println(programacion);
programacion.setH(actual);
    }
}
