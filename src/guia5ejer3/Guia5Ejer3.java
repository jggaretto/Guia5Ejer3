/*
En un nuevo proyecto, en el método main de su clase principal, se pide crear un algoritmo que
rellene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el
vector. El programa mostrará donde se encuentra el número y si se encuentra repetido
 */
package guia5ejer3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Guia5Ejer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        // Rellenar el vector con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // Rango de valores aleatorios del 0 al 99
        }

        System.out.println("Vector generado: " + Arrays.toString(vector));

        System.out.print("Ingrese un número a buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        int indiceEncontrado = -1;
        boolean repetido = false;

        // Buscar el número en el vector
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                if (!encontrado) {
                    encontrado = true;
                    indiceEncontrado = i;
                } else {
                    repetido = true;
                    break;
                }
            }
        }

        if (encontrado) {
            System.out.println("El número se encuentra en el vector en el índice: " + indiceEncontrado);
            if (repetido) {
                System.out.println("El número se encuentra repetido en el vector.");
            } else {
                System.out.println("El número no se encuentra repetido en el vector.");
            }
        } else {
            System.out.println("El número no se encuentra en el vector.");
        }
    }
}