
package programas;

import java.util.Random;
public class ejercicio_propuesto_4 {

     public static void main(String[] args) {
        Random random = new Random();
        int[][] sueldos = new int[5][5];
        int sumaSueldos = 0;
        int cantidadSueldos = 25;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sueldos[i][j] = 1025 + random.nextInt(8976); // Generar sueldo entre 1025 y 10000
                sumaSueldos += sueldos[i][j];
            }
        }

        double promedioSueldos = (double) sumaSueldos / cantidadSueldos;

        System.out.println("Matriz de Sueldos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(sueldos[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Resultados:");
        System.out.println("Suma de sueldos: " + sumaSueldos);
        System.out.println("Promedio de sueldos: " + promedioSueldos);
    }
}