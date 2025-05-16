/*
    Crea una clase Libro con atributos titulo, autor y numeroDePaginas.
    Define un constructor.
    Añade un método mostrarDetalles() que imprima la información del libro.
    Crea un método que indique si el libro es "largo"
    (por ejemplo, si tiene más de 300 páginas).
 */

class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas > 0) {
            this.numeroPaginas = numeroDePaginas;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de Paginas: " + getNumeroPaginas());
    }

    public boolean esLargo() {
        return this.numeroPaginas > 300;
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 432);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        System.out.println("Detalles del Libro 1:");
        libro1.mostrarDetalles();
        System.out.println("¿Es un libro largo? " + (libro1.esLargo() ? "Sí" : "No"));

        System.out.println("\nDetalles del Libro 2:");
        libro2.mostrarDetalles();
        System.out.println("¿Es un libro largo? " + (libro2.esLargo() ? "Sí" : "No"));
    }
}
