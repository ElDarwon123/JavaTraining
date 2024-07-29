package modulo2;

public class ejercicio3 {
    public static void main(String[] args) {
        int number = 28; 
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " es un número perfecto.");
        } else {
            System.out.println(number + " no es un número perfecto.");
        }
    }
}
