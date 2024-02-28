/*
 1.a.- Realiza una clase, de nombre Examen, para guardar información sobre los exámenes 
 * de un centro educativo. La información que se guarda de un examen es: el nombre de la asignatura,
 * el aula, la fecha y la hora. Para guardar la fecha y la hora hay que realizar dos clases, 
 * Fecha y Hora. La clase Fecha guarda día, mes y año. Todos los valores se reciben en el 
 * constructor por parámetro. Además, esta clase debe tener un método que devuelva cada uno 
 * de los atributos y un método toString() que devuelva la información de la fecha en forma de 
 * String. La clase Hora guarda hora y minuto. También recibe los valores para los atributos
 * por parámetro en el constructor, tiene métodos que devuelven cada uno de los atributos 
 * y un método toString().
 */
package REVISION;

public class Examen {

    private String asignatura, aula;
    private Fecha f;
    private Hora h;

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Fecha getFecha() {
        return f;
    }

    public void setFecha(Fecha f) {
        this.f = f;
    }

    public Hora getH() {
        return h;
    }

    public void setH(Hora h) {
        this.h = h;
    }

    public Examen(String asig, String aula, Fecha f, Hora h) {
        this.asignatura = asig;
        this.aula = aula;
        this.f = f;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Asignatura: " + asignatura + " Aula: " + aula + " Fecha: "
                + f + " Hora: " + h;
    }
}
    class Fecha {

        private int dia, mes, anyo;

        public Fecha(int dia, int mes, int anyo) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anyo;
        }

        public void setDia(int d) {
            dia = d;
        }

        public void setMes(int m) {
            mes = m;
        }

        public void setAnyo(int a) {
            anyo = a;
        }

        public int getDia() {
            return dia;
        }

        public int getMes() {
            return mes;
        }

        public int getAnyo() {
            return anyo;
        }

        @Override
        public String toString() {
            return dia + "/" + mes + "/" + anyo;
        }
    }

    class Hora {

        private int hora, minuto;

        public Hora(int hora, int minuto) {
            this.hora = hora;
            this.minuto = minuto;
        }

        public void setHora(int h) {
            hora = h;
        }

        public void setMinuto(int m) {
            minuto = m;
        }

        public int getHora() {
            return hora;
        }

        public int getMinuto() {
            return minuto;
        }

        @Override
        public String toString() {
            return hora + ":" + minuto;
        }
    }
