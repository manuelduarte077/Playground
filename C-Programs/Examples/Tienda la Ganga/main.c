#include <stdio.h>

int main() {
   float precioProducto, totalCompra;
   char etiqueta;

   printf("Bienvenido a Tienda la Ganga\n");
   printf("Ingrese el precio del producto (sin IVA): ");
   scanf("%f", &precioProducto);

   printf("El producto tiene etiqueta azul? (s/n): ");
   scanf(" %c", &etiqueta);

   if (etiqueta == 's') { // si tiene etiqueta azul
      float descuento = precioProducto * 0.3;
      precioProducto = precioProducto - descuento;
      printf("Al tener etiqueta azul, tiene un 30%% de descuento.\n");
      printf("Precio con descuento: $%.2f\n", precioProducto);
   }

   totalCompra += precioProducto;
   printf("El monto de lo que va comprando es: $%.2f\n", totalCompra);

   return 0;
}
