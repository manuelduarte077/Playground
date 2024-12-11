-- Lista
local numeros = { 10, 20, 30, 40, 50 }
for i, valor in ipairs(numeros) do -- ipairs() recorre la lista
	print("Indice:", i, "Valor:", valor)
end

-- Diccioanrio (Tabla)
local persona = {
	nombre = "Juan",
	apellido = "Perez",
	edad = 30,
}

for clave, valor in pairs(persona) do -- pairs() recorre la tabla
	print(clave .. ":", valor)
end

-- Funciones
function Suma(a, b)
	return a + b
end

local resultado = Suma(10, 20)
print("Resultado de la suma:", resultado)
