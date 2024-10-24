package GestionInventarios;

import java.util.ArrayList;
import java.util.List;

class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    // Metodo para añadir un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    // Metodo para eliminar un producto
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }

    // Metodo para actualizar la cantidad de un producto
    public void actualizarProducto(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                producto.setCantidad(cantidad);
                System.out.println("Cantidad de " + nombre + " actualizada a " + cantidad);
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // Metodo para mostrar el inventario
    public void mostrarInventario() {
        System.out.println("Inventario de productos:");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad() + ", Precio: " + producto.getPrecio());
        }
    }
}