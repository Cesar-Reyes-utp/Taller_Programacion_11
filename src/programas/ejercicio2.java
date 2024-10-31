
package programas;

import java.util.Scanner;
public class ejercicio2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaNumeros = 0;
        int cantidadNumeros = 0;

        System.out.println("Ingresa los números enteros para la matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                sumaNumeros += matriz[i][j];
                cantidadNumeros++;
            }
        }

        double promedio = (double) sumaNumeros / cantidadNumeros;

        System.out.println("Resultados:");
        System.out.println("Suma de números (sn): " + sumaNumeros);
        System.out.println("Promedio de números (pnum): " + promedio);
    }
}