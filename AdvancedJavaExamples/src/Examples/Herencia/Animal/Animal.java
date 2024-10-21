package Examples.Herencia.Animal;

// Clase base Animal
abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto para hacer sonido
    public abstract void hacerSonido();

    public void mostrarInformacion() {
        System.out.println("Animal: " + nombre);
    }
}

// Clase Perro (hereda de Animal)
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}

// Clase Gato (hereda de Animal)
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}

// Clase Pájaro (hereda de Animal)
class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Pío pío!");
    }
}

