class Coche {
    private String marca;
    private String modelo;
    private int velocidadActual;

    Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Metodo para obtener la velocidad
    public int obtenerVelocidadActual() {
        return velocidadActual;
    }

    // Metodo para acelerar
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadActual += incremento;
            System.out.println(this.marca + " " + this.modelo + " aceleró a " + this.velocidadActual + " km/h.");
        } else {
            System.out.println("El incremento de velocidad debe ser positivo.");
        }
    }

    public void frenar(int decremento) {
        if (decremento > 0) {
            this.velocidadActual -= decremento;
            if (this.velocidadActual < 0) {
                this.velocidadActual = 0;
            }
            System.out.println(this.marca + " " + this.modelo + " frenó a " + this.velocidadActual + " km/h.");
        } else {
            System.out.println("El decremento de velocidad debe ser positivo.");
        }
    }

}

public class Ejercicio5 {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla");

        System.out.println("Coche creado: " + miCoche.getMarca() + " " + miCoche.getModelo());
        System.out.println("Velocidad actual: " + miCoche.obtenerVelocidadActual() + " km/h");

        miCoche.acelerar(50);
        miCoche.acelerar(30);
        miCoche.frenar(20);
        miCoche.frenar(70); // Frenará hasta 0
        miCoche.frenar(10); // Ya está en 0
        miCoche.acelerar(-10); // Intento inválido
    }
}
