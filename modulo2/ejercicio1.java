package modulo2;

public class ejercicio1 {
    public static void main(String[] args) {

        int number = 5;
        // el factorial debe ser mayor a 1
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + number + " es: " + factorial);
    }
}
