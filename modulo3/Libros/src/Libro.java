

public class Libro {
    String autor;
    String titulo;
    int paginas;
    public Libro(String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void mostrarLibro() {
        System.out.println("El libro "+ titulo +", del autor "+ autor +", tiene "+ paginas +" páginas.");
    }

    public static void compararLibros(Libro libro1, Libro libro2 ) {
        if (libro1.paginas > libro2.paginas) {
            System.out.println("El libro: "+ libro1.titulo +" tiene "+ libro1.paginas +", tiene más páginas.");
        }else{
            System.out.println("El libro: "+ libro2.titulo +" tiene "+ libro2.paginas +", tiene más páginas.");
        }
    }
}
