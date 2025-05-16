package Herencia;

public class Motocicleta extends Vehiculo {
    private int cilindrada;
    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int cilindrada, String tipoManillar) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
        this.tipoManillar = tipoManillar;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta " + marca + " " + modelo + " (" + cilindrada + "cc) ruge al arrancar (método sobrescrito).");
    }

    public void hacerCaballito() {
        System.out.println("La motocicleta " + marca + " " + modelo + " está haciendo un caballito! (¡Con cuidado!)");
    }

    public void mostrarInfoMoto() {
        System.out.println("Motocicleta: " + getMarca() + " " + getModelo() + ", Cilindrada: " + cilindrada + "cc, Manillar: " + tipoManillar);
    }
}
