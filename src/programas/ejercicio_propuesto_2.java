package programas;

import java.util.Scanner;
public class ejercicio_propuesto_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] compras = new int[4][4];
        int totalCompras = 0;
        int cantidadCompras = 16;

        System.out.println("Ingresa las compras para la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra [" + i + "][" + j + "]: ");
                compras[i][j] = sc.nextInt();
                totalCompras += compras[i][j];
            }
        }

        double promedioCompras = (double) totalCompras / cantidadCompras;

        System.out.println("Total de las compras: " + totalCompras);
        System.out.println("Promedio de las compras: " + promedioCompras);
    }
}
