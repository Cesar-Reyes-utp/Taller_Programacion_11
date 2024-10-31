package programas;
import java.util.Random;
import java.util.Scanner;

public class ejercicio_propuesto_4 {
     public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        int cantidadVentas = 9;

        System.out.println("Matriz de ventas aleatorias (1000 - 10000):");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextInt(9001); // Generar ventas entre 1000 y 10000
                totalVentas += ventas[i][j];
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        double promedioVentas = (double) totalVentas / cantidadVentas;

        System.out.println("Total de las ventas: " + totalVentas);
        System.out.println("Promedio de las ventas: " + promedioVentas);
    }
}