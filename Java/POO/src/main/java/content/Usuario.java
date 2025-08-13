package content;

public class Usuario {
    public String nombre;
    public String email;

    public void ver(Pelicula pelicula) {
        System.out.println(nombre + " estas¡ viendo...");
        pelicula.reproducir();
    }
}