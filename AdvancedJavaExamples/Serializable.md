Explicación:

1. Clase Empleado:

- Implementa la interfaz Serializable, lo que permite que sus objetos se puedan convertir en un flujo de bytes para ser
  almacenados en archivos o transmitidos a través de una red.

- La variable serialVersionUID se utiliza para verificar la consistencia de la clase durante la deserialización,
  garantizando que las versiones de la clase coincidan. Aunque no es obligatorio declararla, es una buena práctica para
  evitar posibles problemas cuando se hacen cambios en la clase.

- Tiene tres campos: nombre, edad y salario.

2. Método guardarEmpleadosEnArchivo():

- Este método toma una lista de empleados y la guarda en un archivo.
- Utilizamos ObjectOutputStream junto con FileOutputStream para escribir el objeto serializado (en este caso, una
  lista de empleados) en el archivo.
- La lista completa de empleados se convierte en un flujo de bytes y se almacena en el archivo.

3. Método leerEmpleadosDesdeArchivo():

- Este método lee el archivo que contiene la lista serializada de empleados.
- Utiliza ObjectInputStream junto con FileInputStream para leer el archivo y convertir los bytes de vuelta en una
  lista de objetos Empleado.
- Si la lectura es exitosa, devuelve la lista de empleados.

4. Uso en el main():

- Primero, se crea una lista de empleados y se guarda en un archivo con el nombre empleados.dat.
- Luego, se lee el archivo y se reconstruye la lista de empleados.
- Finalmente, se imprime la lista de empleados deserializada.