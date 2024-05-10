package ejercicio_1;
import java.util.Scanner;

public class ejercicio_1 {
       
     /* Ejercicio_1: Un alumno tiene n notas (Se ingresa por teclado la cantidad de notas) que se deben
    cargar en un vector (Se debe definir el vector en base a la cantidad de notas que se van a
    ingresar, por ejemplo: Si son 5 notas, el vector debe ser de tamaño 5). Luego de cargar las
    notas se debe mostrar la nota más alta y el promedio de notas.*/

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("*------------------NOTAS DEL ALUMNO---------------------*");
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de Notas del alumno:");
        int ctdadDeNotas = scanner.nextInt();
        double[] notas = new double[ctdadDeNotas];
        double notaMasAlta = 0;
        double sumProm = 0;
        double promFinal = 0;
        System.out.println(" ");
        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Ingrese la nota " + (i+1) + "/" + notas.length + ": ");
            notas[i] = scanner.nextDouble();
            System.out.println(" ");
            sumProm += notas[i];  
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }
        promFinal = sumProm / notas.length;
        scanner.close();
        System.out.println("*------------------RESULTADOS---------------------*");
        System.out.println(" ");
        System.out.println("La nota mas alta del alumno es: " + notaMasAlta + " y su promedio final es: " + promFinal);
 
    }

}