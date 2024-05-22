package ejercicio_4;

import java.util.Scanner;

public class ejercicio_4 {
    /*
     * Ejercicio_4: Una empresa de camiones necesita un algoritmo para controlar el egreso de sus 30
        camiones desde la planta y la carga que transportan. Para ello, se necesita que por cada camión
        se cargue por teclado su patente, el nombre y apellido del chofer, el tipo de carga que lleva
        (madera, yerba o té) y a qué hora egresó. Además, la empresa necesita saber cuántos camiones
        cargaron té. Al final, debe mostrar todos estos datos por pantalla al usuario.
     */

    public static void main(String[] args) {

        final int numCamiones = 30;
        String[] patentes = new String[numCamiones];
        String[] nombresChoferes = new String[numCamiones];
        String[] tiposCargas = new String[numCamiones];
        String[] horasEgreso = new String[numCamiones];
        int camionesConTe = 0;
        

        System.out.println();
        System.out.println("----------REGISTRO: Datos de Camiones----------");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numCamiones; i++) {
            System.out.println("Ingrese los datos del camión " + (i + 1) + ":");
            System.out.println();
            System.out.print("Patente: ");
            patentes[i] = scanner.nextLine();

            System.out.print("Nombre y Apellido del Chofer: ");
            nombresChoferes[i] = scanner.nextLine();

            System.out.print("Tipo de carga (madera, yerba o te): ");
            tiposCargas[i] = scanner.nextLine();

            if (tiposCargas[i].equals("te")) {
                camionesConTe++;
            }

            System.out.print("Hora de egreso: ");
            horasEgreso[i] = scanner.nextLine();
            System.out.println("---------------------------");
            System.out.println();
        }

        scanner.close();
        System.out.println();
        System.out.println("----------REGISTRO: Egreso de Camiones----------");
        System.out.println();
        for (int i = 0; i < numCamiones; i++) {
            System.out.println("Camión " + (i + 1) + ":");
            System.out.println("Patente: " + patentes[i]);
            System.out.println("Nombre y Apellido del Chofer: " + nombresChoferes[i]);
            System.out.println("Tipo de carga: " + tiposCargas[i]);
            System.out.println("Hora de egreso: " + horasEgreso[i]);
            System.out.println();
        }

        System.out.println("Cantidad de camiones que cargaron té: " + camionesConTe);
    }
}
