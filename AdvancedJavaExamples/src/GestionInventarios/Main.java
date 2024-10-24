package GestionInventarios;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Producto producto1 = new Producto("Laptop", 1200.00, 10);
        Producto producto2 = new Producto("Mouse", 25.00, 50);

        almacen.agregarProducto(producto1);
        almacen.agregarProducto(producto2);

        almacen.mostrarInventario();
        almacen.actualizarProducto("Laptop", 8);
        almacen.mostrarInventario();
    }
}
