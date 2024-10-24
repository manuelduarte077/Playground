package Pedidos;

import java.util.ArrayList;
import java.util.List;

// Clase Pedido
class Pedido {
    private List<Producto> productos;
    private double descuento;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.descuento = 0;
    }

    // Metodo para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Metodo para calcular el total
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total - descuento;
    }

    // Metodo para aplicar un descuento
    public void aplicarDescuento(double descuento) {
        this.descuento = descuento;
        System.out.println("Descuento aplicado: " + descuento);
    }

    // Metodo para mostrar los productos del pedido
    public void mostrarPedido() {
        System.out.println("Productos en el pedido:");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
        System.out.println("Total con descuento: " + calcularTotal());
    }
}