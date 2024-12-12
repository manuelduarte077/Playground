function CalcularAreaCirculo(radio)
	return math.pi * radio ^ 2
end

io.write("Ingrese el radio del circulo: ")
local radio = tonumber(io.read())

if radio and radio > 0 then
	local area = CalcularAreaCirculo(radio)
	print("El area del circulo es: " .. area)
else
	print("El radio debe ser un numero positivo")
end
