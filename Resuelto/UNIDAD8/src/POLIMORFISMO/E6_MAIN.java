/*
 6.b.- Utilizando las clases del ejercicio anterior, implementa una aplicación que haga lo siguiente: 
 */
package POLIMORFISMO;

public class E6_MAIN {

    public static void main(String[] args) {
        
        // a) Declare y cree un array de 4 vehículos. 
        //b) Cree 2 camiones y 2 coches y los añada al array. 
        
        Coche coche1 = new Coche("V-1234HT-", 5);
        Coche coche2 = new Coche("V-4657GW", 3);
        Camion camion1 = new Camion("4598-HGT");
        Camion camion2 = new Camion("5768-DHV");

        Vehiculo[] vehiculos = {coche1, coche2, camion1, camion2};
        
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Camion) {
                //Hacer un downcasting para poder utilizar el metodo del hijo
                /*Importante los dos parentesis*/
                ((Camion) vehiculo).ponRemolque(5000);
            }
        }
        for (Vehiculo vehiculo : vehiculos) {
            try {
                vehiculo.acelerar(110);
            }catch (DemasiadoRapidoException x) {
                System.out.println("Frena o quita el remolque!!!!");
            }
        }
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}
