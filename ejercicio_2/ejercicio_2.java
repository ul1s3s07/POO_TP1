package ejercicio_2;
import java.util.Scanner;
public class ejercicio_2 {
    /* Ejercicio_2: Cargar un vector con “n” notas e indicar la cantidad de aprobados (Notas mayores o
iguales a 6), la cantidad de desaprobados (Notas menores a 6).*/

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("*------------------NOTAS DE ALUMNOS---------------------*");
        System.out.println(" ");
        System.out.println("Ingrese la cantidad  para contabilizar los aprobados y desaprobados:");

        int ctdadDeNotas = scanner.nextInt();
        double[] notas = new double[ctdadDeNotas];
        System.out.println(" ");
        int ctdadAprobados = 0;
        int ctdadDesAp = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Ingrese la nota " + (i + 1) + "/" + ctdadDeNotas);
            notas[i] = scanner.nextDouble();
            System.out.println(" ");

            if (notas[i] >= 6 ) {
                ctdadAprobados += 1;
            } else {
                ctdadDesAp += 1;
            }

        }
        scanner.close();
        System.out.println(" -------------------------------------------");
        System.out.println("| La cantidad de alumnos desaprobados es: " + ctdadDesAp + " |");
        System.out.println("| La cantidad de alumnos aprobados es: " + ctdadAprobados + "    |");
        System.out.println(" -------------------------------------------");
        System.out.println(" ");

    }

}