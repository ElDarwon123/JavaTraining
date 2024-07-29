package modulo2;

public class ejercicio2 {
    public static void main(String[] args) {
        
        // variable para designar al numero para sacar la cantidad de divisores
        int num = 28; 

        System.out.println("Los divisores de " + num + " son:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
