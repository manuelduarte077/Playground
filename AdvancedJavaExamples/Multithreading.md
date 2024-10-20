**Clase TiendaOnline:**

- a clase representa una tienda en línea que maneja el stock de productos.
- El método comprar() está marcado como synchronized, lo que asegura que solo un hilo a la vez pueda modificar el stock.
  Si no tuviéramos este control, varios hilos podrían modificar el stock simultáneamente, lo que podría causar errores (
  como que se vendan más productos de los que hay en stock).
- El método también imprime mensajes sobre el hilo actual, la cantidad que intenta comprar, y el stock restante después
  de la compra.

**Clase Cliente:**

- Esta clase implementa Runnable, lo que permite que sea ejecutada en un hilo.
- Cada cliente intentará realizar una compra a la tienda. La cantidad de productos que intenta comprar varía para cada
  cliente (1, 2, 3, etc.).
- Después de realizar la compra, el cliente notifica al CountDownLatch que ha terminado reduciendo el conteo.

**CountDownLatch:**

- Se usa para sincronizar a los hilos y asegurarse de que todos terminen antes de continuar.
- El latch.await() bloquea el hilo principal hasta que todos los clientes han terminado de comprar.
- Cada cliente reduce el valor del latch cuando termina su compra (latch.countDown()).

**ExecutorService:**

- Usamos un ExecutorService con un pool de hilos de tamaño fijo (newFixedThreadPool(numeroClientes)), lo que permite que
  el número de hilos activos sea controlado de manera eficiente.
- Cada cliente es ejecutado en un hilo separado usando executor.submit(new Cliente(tienda, cantidadCompra, latch)).
- Una vez que todas las compras han sido procesadas, se apaga el ExecutorService con executor.shutdown().

**Flujo de ejecución:**

1. La tienda comienza con un stock inicial de 10 productos.
2. Creamos 5 clientes, y cada cliente intenta comprar una cantidad creciente de productos (1, 2, 3, 4 y 5 productos,
   respectivamente).
3. Los hilos de los clientes se ejecutan en paralelo (de manera concurrente) gracias al ExecutorService.
4. Cada cliente accede al método comprar() de la tienda, que está protegido por synchronized para garantizar que solo un
   hilo a la vez puede modificar el stock.
5. El CountDownLatch asegura que el programa espere hasta que todos los clientes hayan terminado de comprar antes de
   finalizar.
6. Finalmente, el programa imprime el stock restante y finaliza.

Ejemplo de salida (puede variar debido a la concurrencia):

```bash
pool-1-thread-1 está comprando 1 productos.
Compra completada por pool-1-thread-1. Stock restante: 9
pool-1-thread-2 está comprando 2 productos.
Compra completada por pool-1-thread-2. Stock restante: 7
pool-1-thread-3 está comprando 3 productos.
Compra completada por pool-1-thread-3. Stock restante: 4
pool-1-thread-4 está comprando 4 productos.
Compra completada por pool-1-thread-4. Stock restante: 0
pool-1-thread-5 intentó comprar 5 productos, pero no hay suficiente stock.
Todas las compras han sido procesadas. Stock final: 0
```