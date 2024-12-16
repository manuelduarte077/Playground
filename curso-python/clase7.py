name = input("Cual es tu nombre? ")
print(f"Hola {name}!")  # Hola John Doe!


age = int(input("Cual es tu edad? "))  # 25
print(f"Tienes {age} años")  # Tienes 25 años

salary = float(input("Cual es tu salario? "))  # 1000.50

work = bool(input("Trabajas? "))  # True


if age >= 18:
    print("Eres mayor de edad")

    if work:
        print("Tienes trabajo")

    if salary > 1000:
        print("Tienes un buen salario")

else:
    print("Eres menor de edad")
