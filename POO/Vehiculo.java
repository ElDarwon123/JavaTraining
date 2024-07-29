package POO;

public class Vehiculo {
    String marca;
    String modelo;
    String color;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    void informacion() {
        System.out.println("\n============== VEHICULO ==================");
        System.out.println(" marca: " + marca + " modelo: " + modelo + " color: " + color);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
