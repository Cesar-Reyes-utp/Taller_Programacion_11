package programas;

import java.util.Scanner;
public class ejercicio_propuesto_1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaPares = 0;
        int cantidadImpares = 0;

        System.out.println("Ingresa los números enteros para la matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                } else {
                    cantidadImpares++;
                }
            }
        }

        System.out.println("Resultados:");
        System.out.println("Suma de pares (sp): " + sumaPares);
        System.out.println("Cantidad de impares (ci): " + cantidadImpares);
    }
}