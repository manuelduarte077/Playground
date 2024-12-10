-- Operaciones simples

local a, b = 10, 5
print("Suma: " .. a + b)
print("Resta: " .. a - b)
print("Multiplicación: " .. a * b)
print("División: " .. a / b)
print("Módulo: " .. a % b)
print("Potencia: " .. a ^ b)

-- Funciones matemáticas

function Cuadrado(x)
	return x * x
end

print("El cuadrado de 5 es: " .. Cuadrado(5))
