math.randomseed(os.time())
local numero_secreto = math.random(1, 10)

print("Adivina el numero (entre 1 y 10):")
while true do
	io.write("Introduce tu respuesta: ")
	local respuesta = tonumber(io.read())

	if respuesta == numero_secreto then
		print("Correcto! El numero secreto es:", numero_secreto)
		break
	elseif respuesta < numero_secreto then
		print("El numero secreto es mayor")
	else
		print("El numero secreto es menor")
	end
end
