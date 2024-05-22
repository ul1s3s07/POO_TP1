package ejercicio_5;
import java.util.Scanner;
public class ejercicio_5 {
    /* Ejercicio_5: Un gerente de una empresa prestadora de servicios de internet necesita un algoritmo que
permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI del
cliente y tipo de servicio. Los tipos de servicio son 3: 1. Internet 30 megas (El servicio
cuesta: $750) 2. Internet 50 megas (El servicio cuesta: $1100) 3. Internet 100 megas (El
servicio cuesta: $1500 – menos 5% de descuento por promoción) El algoritmo debe poder
calcular el monto a pagar (dependiendo del tipo de servicio con el que cuente el cliente) e
informar por pantalla el dni del mismo junto con el monto a pagar y el número de servicio
con el que cuenta.*/

    public static void main(String[] args) {
        
        int numClientes = 5;
        String[] dniClientes = new String[numClientes];
        int[] tiposServicios = new int[numClientes];
        double[] montosApagar = new double[numClientes];

        System.out.println();
        System.out.println("----------SERVICIOS DE INTERNET----------");
        System.out.println();
        

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numClientes; i++) {
            System.out.println("Ingrese los datos del cliente " + (i + 1) + ":");
            System.out.println();
            System.out.print("DNI del cliente: ");
            dniClientes[i] = scanner.nextLine();
            System.out.println();
            
            System.out.println("Tipo de servicio:");
            System.out.println();
            System.out.println("1. Internet 30 megas ($750)");
            System.out.println("2. Internet 50 megas ($1100)");
            System.out.println("3. Internet 100 megas ($1500 con 5% de descuento)");
            System.out.println();
            System.out.print("Ingrese el número del tipo de servicio: ");
            tiposServicios[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.println("----------------------------------");
            
            switch (tiposServicios[i]) {
                case 1:
                    montosApagar[i] = 750;
                    break;
                case 2:
                    montosApagar[i] = 1100;
                    break;
                case 3:
                    montosApagar[i] = 1500 * 0.95; // Aplica el descuento del 5%
                    break;
                default:
                    System.out.println("Tipo de servicio no válido.");
                    montosApagar[i] = 0; // En caso de un tipo de servicio inválido
            }
            
            System.out.println();  // Línea en blanco para separar las entradas de cada cliente
        }
        
        scanner.close();
        
        System.out.println();
        System.out.println("----------FACTURAS DEL SERVICIO DE INTERNET----------");
        System.out.println();

        for (int i = 0; i < numClientes; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            System.out.println();
            System.out.println("DNI: " + dniClientes[i]);
            System.out.println("Tipo de servicio: " + tiposServicios[i]);
            System.out.println("Monto a pagar: $" + montosApagar[i]);
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
        }
    }
}
