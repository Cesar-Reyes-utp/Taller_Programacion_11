package programas;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_propuesto_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int mayorVenta = Integer.MIN_VALUE;
        int menorVenta = Integer.MAX_VALUE;

        System.out.println("Matriz de ventas aleatorias (10 - 5000):");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + random.nextInt(4991); // Generar ventas entre 10 y 5000
                System.out.print(ventas[i][j] + "\t");

                if (ventas[i][j] > mayorVenta) {
                    mayorVenta = ventas[i][j];
                }
                if (ventas[i][j] < menorVenta) {
                    menorVenta = ventas[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Venta mayor: " + mayorVenta);
        System.out.println("Venta menor: " + menorVenta);
    }
}
