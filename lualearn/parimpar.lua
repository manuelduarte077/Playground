function EsPar(numero)
	return numero % 2 == 0 -- Si el residuo de dividir el numero entre 2 es 0, entonces es par
end

-- Entrada de usuario
io.write("Ingrese un numero: ")
local numero = tonumber(io.read())

if numero then
	if EsPar(numero) then
		print("El numero es par")
	else
		print("El numero es impar")
	end
else
	print("Debe ingresar un numero")
end
