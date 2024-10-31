
package programas;

import java.util.Scanner;
public class ejercicio_propuesto_3 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingresa los números enteros para la matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Resultados:");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}