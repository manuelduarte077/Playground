class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;

    // constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Metodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

}

public class Ejercicio1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 20, "Femenino");
        persona.mostrarInformacion();

        System.out.println("\nActualizando edad de Ana...");
        persona.setEdad(31);
        System.out.println("Nueva edad: " + persona.getEdad());
        persona.mostrarInformacion();
    }
}