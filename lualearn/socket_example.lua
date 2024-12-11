local socket = require("socket")
local server = assert(socket.bind("*", 12345))

print("Servidor escuchando en el puerto 12345")
while true do
	local cliente = server:accept()
	cliente:send("Hola cliente!\n")
	cliente:close()
end
