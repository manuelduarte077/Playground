print("Bienvenido a la Calculadora en Lua")
local num1, num2, resultado, operation

print("Ingrese el primer número:")
num1 = tonumber(io.read())

print("Ingrese la operación (+, -, *, /):")
operation = io.read()

print("Ingrese el segundo número:")

num2 = tonumber(io.read())

if operation == "+" then
	resultado = num1 + num2
elseif operation == "-" then
	resultado = num1 - num2
elseif operation == "*" then
	resultado = num1 * num2
elseif operation == "/" then
	if num2 ~= 0 then
		resultado = num1 / num2
	else
		print("Error: No se puede dividir por cero")
		return
	end
else
	print("Operación no válida")
	return
end

print("El resultado es: " .. resultado)

-- Variables
local a, b

-- Initialization
b = 10
a = 4

print("value of a:", a)
print("value of b", b)

-- Swapping of variables
b, a = a, b

print("Value of a:", a)
print("Value of b:", b)

f = 70.0 / 3.0
print("value of f:", f)
