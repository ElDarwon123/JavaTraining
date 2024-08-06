

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Steven", "Java en 5 minutos", 300);
        Libro libro2 = new Libro("Darwin", "typescript en 3 minsutos", 450);
        libro1.mostrarLibro();
        libro2.mostrarLibro();
        Libro.compararLibros(libro1, libro2);
    }
}
