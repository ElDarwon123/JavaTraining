package POO;

public class Estudiante {
    String nombre;
    String direccion;
    String telefono;

    public Estudiante(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    void mostrarInfo() {
        System.out.println("=== ESTUDIANTE ===");
        System.out.println("NOMBRE: " + nombre + " DIRECCION: " + direccion + " TELEFONO: " + telefono);
    }

}
