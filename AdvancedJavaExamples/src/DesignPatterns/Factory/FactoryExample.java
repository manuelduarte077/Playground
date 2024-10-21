package DesignPatterns.Factory;

interface Auto {
    void conducir();
}

// Clases concretas que implementan la interface Auto
class Sedan implements Auto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un Sedan");
    }
}

class SUV implements Auto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un SUV");
    }
}

class Camioneta implements Auto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una Camioneta");
    }
}

// Clase Fábrica
class FabricaDeAutos {
    // Metodo que devuelve un tipo de auto según la entrada
    public static Auto crearAuto(String tipoAuto) {
        switch (tipoAuto) {
            case "Sedan":
                return new Sedan();
            case "SUV":
                return new SUV();
            case "Camioneta":
                return new Camioneta();
            default:
                throw new IllegalArgumentException("Tipo de auto no soportado.");
        }
    }
}
