package ejercicio_7;

import java.util.Scanner;

public class ejercicio_7 {
    /* Ejercicio_7: Se realizó un censo provincial y se desea procesar la información obtenida en dicho
censo. De cada una de las personas censadas se tiene la siguiente información: número de
documento, edad y sexo (‘F’ o ‘M’). Realizar un algoritmo que lea los datos de cada persona
censada (para fin de ingreso de datos, ingresar 0 (cero) como numero de documento) e
informe: Cantidad total de personas censadas, cantidad de varones y cantidad de mujeres,
porcentaje de varones cuya edad varía entre 16 y 65 años respecto del total de varones,
mostrar datos de la persona que registra la mayor edad.*/

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Se toma de ejemplo una población total de 10 personas aleatorias para realizar el ejercicio.
        
        char[] sexo = {'F', 'M', 'F', 'M','F', 'M','F', 'M', 'F', 'M'};
        int[] edades = {16, 76, 65, 33, 24, 27, 88, 32, 80, 20};
        // String[] dni = {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"};
        int ctdadVarones = 0;
        int ctdadMujeres = 0;
        int varonesEntre16y65 = 0;
        int mayorEdad = 0;
        int censoTotal = 0;
        
        for (int i = 0; i < edades.length; i++) {
            censoTotal++;
            if (sexo[i] == 'F') {
                ctdadMujeres++;
            } else if (sexo[i] == 'M') {
                ctdadVarones++;
                if (edades[i] >= 16 && edades[i] <= 65) {
                    varonesEntre16y65++;
                }
            }
            if (edades[i] > mayorEdad) {
                mayorEdad = edades[i];
            }
        }
        
        double porcTotal = ((double) varonesEntre16y65 / ctdadVarones) * 100;

        System.out.println();
        System.out.println("---------- ** RESULTADOS DEL CENSO ** ----------");
        System.out.println("El total de personas censadas es: " + censoTotal);
        System.out.println("La cantidad de mujeres sobre el total es de: " + ctdadMujeres + " mujeres.");
        System.out.println("La cantidad de varones sobre el total es de: " + ctdadVarones + " varones.");
        System.out.println("La persona con la edad más alta del censo tiene: " + mayorEdad);
        System.out.println("El porcentaje de hombres entre 16 y 65 años respecto del total de varones es: " + porcTotal + "% de los " + ctdadVarones + " totales.");
        System.out.println("------------------------------------------");
        System.out.println();

        scanner.close();

    }
}