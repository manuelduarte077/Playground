local lanzarDado

math.randomseed(os.time()) -- Seed the random number generator with the current time

function lanzarDado()
	return math.random(1, 6)
end

print("Lanzaste un dado y salió: " .. lanzarDado())
