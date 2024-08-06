package POO;

public class Juego {
    int puntaje;
    String niveles;
    String nombre;

    public Juego(int puntaje, String niveles, String nombre){
        this.puntaje = puntaje;
        this.niveles = niveles;
        this.nombre = nombre;
    }

    public void infoJuego() {
        System.out.println("\n \u001B[35m ======= JUEGO ======");
        System.out.println("Nombre: " + nombre + ", Niveles: " + niveles + ", Puntaje: " + puntaje);
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setNiveles(String niveles) {
        this.niveles = niveles;
    }

    public String getNiveles() {
        return niveles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
