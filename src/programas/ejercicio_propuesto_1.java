package programas;
import java.util.Scanner;

public class ejercicio_propuesto_1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[4][4];
        int totalVentas = 0;

        System.out.println("Ingresa las ventas para la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta [" + i + "][" + j + "]: ");
                ventas[i][j] = sc.nextInt();
                totalVentas += ventas[i][j];
            }
        }

        System.out.println("Total de las ventas: " + totalVentas);
    }
}
