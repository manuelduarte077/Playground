package Examples;

import java.util.ArrayList;
import java.util.List;

// Clase Libro
class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    // Métodos para gestionar el préstamo del libro
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' no está prestado.");
        }
    }

    public boolean isPrestado() {
        return prestado;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

// Clase Biblioteca
class Biblioteca {
    private List<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar libros a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido añadido a la biblioteca.");
    }

    // Método para mostrar la lista de libros y su estado
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " de " + libro.getAutor() + " - " + (libro.isPrestado() ? "Prestado" : "Disponible"));
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        libro1.prestar();
        biblioteca.mostrarLibros();

        libro1.devolver();
        biblioteca.mostrarLibros();
    }
}