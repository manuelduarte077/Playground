package Examples.Herencia.Animal;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex");
        Gato gato = new Gato("Whiskers");
        Pajaro pajaro = new Pajaro("Piolín");

        perro.mostrarInformacion();
        perro.hacerSonido();

        gato.mostrarInformacion();
        gato.hacerSonido();

        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
    }
}
