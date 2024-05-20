package ejercicio_3;
public class ejercicio_3 {
    /* Ejercicio_3: Se tienen 2 vectores con “n” productos, uno con las cantidades[n] y el otro con los
costos[n]. Determinar el precio total e informar todos aquellos que superen los $1000.*/

    public static void main(String[] args) {
        
        int[] ctdades = {10, 3, 8, 2, 5};
        double[] costos = {200.0, 500.0, 50.0, 20.0, 10.0};
        double precioTotal = 0;

        System.out.println(" ");
        System.out.println("------------- PRODUCTOS MAYORES A $1000 -------------");
        System.out.println(" ");

        for (int i = 0; i < ctdades.length; i++) {

            double costoTotal = ctdades[i] * costos[i];
            precioTotal += costoTotal;
             
            if (costoTotal > 1000) {

                System.out.println("Producto " + (i + 1) + ": Cantidad = " + ctdades[i] + ", Costo por unidad = " + costos[i] + ", Costo total = " + costoTotal);

            };

        };
        System.out.println(" ");
        System.out.println("------------- PRECIO TOTAL DE TODOS LOS PRODUCTOS -------------");
        System.out.println(" ");
        System.out.println("Precio total de todos los productos: $" + precioTotal);
        System.out.println(" ");
    }
}
