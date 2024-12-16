def print_exception_hierarchy(exception_class, indent=0):
    print(" " * indent + exception_class.__name__)
    for subclass in exception_class.__subclasses__():
        print_exception_hierarchy(subclass, indent + 4)


print_exception_hierarchy(Exception)


try:
    divisor = int(input("Ingresa un numero divisor: "))
    result = 100 / divisor
    print(result)
except ZeroDivisionError as e:
    print("Error: El divisor no puede ser cero")
    print("Ha ocurrido un error: ", e)
except ValueError as e:
    print("Error: Debes introducir un número válido ")
    print("Ha ocurrido un error: ", e)
