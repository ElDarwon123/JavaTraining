package modulo2;

import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) {
        int numero = 5; 
        
        int sumatoria = 0;
        for (int i = 0; i <= numero; i++) {
            sumatoria += i;
        }
        
        System.out.println("Numero en cuestión: " + numero);

        double raizCuadrada = Math.sqrt(sumatoria);
        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(sumatoria) + 1;
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
        
        System.out.print("Divisores de la sumatoria: ");
        for (int i = 1; i <= sumatoria; i++) {
            if (sumatoria % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("Factorial del numero: " + numero + " es: " + factorial);

        boolean esPerfecto = esNumeroPerfecto(numero);
        System.out.println("¿El número " + numero + " es un número perfecto? " + esPerfecto);
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
