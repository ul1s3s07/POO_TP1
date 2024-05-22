package ejercicio_6;
import java.util.Scanner;

public class ejercicio_6 {
    /* Ejercicio_6: En una carrera automovilística se desea calcular cuál es el menor tiempo realizado entre
cada uno de sus 12 competidores. Para ello, se pide un algoritmo que sea capaz de permitir
el ingreso por teclado del número de vehículo y el tiempo (en segundos) de cada
participante. Una vez encontrado el que realizó el mejor tiempo, se debe informar por
pantalla tanto el número de vehículo que utilizaba como el tiempo que llevó a cabo.*/

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        
        int competidores = 12;
        int winner = 0;
        double minTiempo = 0;
        double flag = 999;
        double[] tiempos = new double[competidores];
        int[] nDeCompetidor = new int[competidores];
        
        System.out.println();
        System.out.println("--------DATOS DE COMPETIDORES-------");
        System.out.println();

        for (int i = 0; i < nDeCompetidor.length; i++) {
            System.out.println("Ingrese el número de vehículo competidor:");
            nDeCompetidor[i] = scanner.nextInt();
            System.out.println();
            System.out.print("Ingrese el tiempo que realizó el vehículo n° " + nDeCompetidor[i] + ": ");
            tiempos[i] = scanner.nextDouble();
            
            if (tiempos[i] < flag) {
                flag = tiempos[i];
                minTiempo = flag;
                winner = nDeCompetidor[i];
            }
            System.out.println();
            System.out.println("------------------------------");
            System.out.println();
        }

        scanner.close();

        System.out.println("---------------RESULTADOS FINALES---------------");
        System.out.println();

        System.out.println("* El competidor con el menor tiempo es el vehículo " + winner + ".");
        System.out.println();
        System.out.println("* Realizó un tiempo de " + minTiempo + " segundos.");
        System.out.println();
        
    }
}      

