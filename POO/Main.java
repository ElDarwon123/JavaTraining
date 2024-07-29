package POO;

public class Main {
    public static void main(String[] args) {
        // System.out.println("hola");
        // Persona yo = new Persona();
        // yo.nombre = "Steven";
        // yo.apellido = "yo";
        // yo.edad = 18;

        // yo.mostrarWeas();

        // Estudiante estu1 = new Estudiante("Darwon", "Gomez", "yo");
        // estu1.mostrarInfo();

        // Vehiculo carro1 = new Vehiculo("Mazda", "2030", "Negro");
        // carro1.informacion();

        // carro1.setModelo("MOdeLAzoO");
        // carro1.setColor("Rojito");

        // carro1.informacion();

        // Juego game1 = new Juego("0", "30", "Cueva");
        Personaje pj1 = new Personaje("Papu", 10, "Elfo de sangre", 0, "0", "D&D");

        System.out.println("\n \u001B[33m ==> Inicia el juego <== ");
        //game1.infoJuego();
        pj1.informacion();
        System.out.println("\u001B[37m");

        


    }
}
