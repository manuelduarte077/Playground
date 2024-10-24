package Pedidos;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Auriculares", 50.0);

        Pedido pedido = new Pedido();
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        pedido.mostrarPedido();
        pedido.aplicarDescuento(100.0);
        pedido.mostrarPedido();
    }
}