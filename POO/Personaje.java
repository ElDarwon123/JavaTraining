package POO;

public class Personaje extends Juego{
    private String nombre;
    private int numVidas;
    private String tipo;


    public Personaje(String nombre, int numVidas, String tipo, int puntaje, String niveles, String nombreJuego){
        super(puntaje, niveles, nombreJuego);
        this.nombre = nombre;
        this.numVidas = numVidas;
        this.tipo = tipo;
    }
    
    public void informacion() {
        System.out.println("\n \u001B[36m ====== PERSONAJE ======");
        System.out.println("Nombre: " + nombre + ", Vidas: " + numVidas + ", Tipo: " + tipo);
        super.infoJuego();
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    public int getNumVidas() {
        return numVidas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
