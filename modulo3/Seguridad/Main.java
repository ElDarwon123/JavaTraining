package modulo3.Seguridad;

public class Main {
    public static void main(String[] args) {
        Password password = new Password(100);
        System.out.println("=== Generación de contraseña ===");

        System.out.println("Contraseña: "+ password.getPassword());

        password.imprimirValidacion();
    }
}
