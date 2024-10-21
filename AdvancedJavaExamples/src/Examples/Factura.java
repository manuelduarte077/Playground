package Examples;

import java.util.ArrayList;
import java.util.List;

// Clase Producto
class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método para obtener el total por producto
    public double obtenerTotal() {
        return precio * cantidad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}

// Clase Factura
class Factura {
    private String numeroFactura;
    private String fecha;
    private List<Producto> productos;

    // Constructor
    public Factura(String numeroFactura, String fecha) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }

    // Método para añadir un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para calcular el total de la factura
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.obtenerTotal();
        }
        return total;
    }

    // Método para mostrar la factura
    public void mostrarFactura() {
        System.out.println("Factura Número: " + numeroFactura + " - Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " (x" + producto.getCantidad() + "): " + producto.getPrecio() + " cada uno.");
        }
        System.out.println("Total a pagar: " + calcularTotal());
    }

    public static void main(String[] args) {
        Factura factura = new Factura("F001", "2024-10-20");
        factura.agregarProducto(new Producto("Laptop", 800, 1));
        factura.agregarProducto(new Producto("Mouse", 25, 2));
        factura.agregarProducto(new Producto("Teclado", 45, 1));

        factura.mostrarFactura();
    }
}