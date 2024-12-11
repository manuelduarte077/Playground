function love.load()
	love.graphics.setBackgroundColor(0.2, 0.2, 0.2)
end

function love.draw()
	local x, y = love.mouse.getPosition()
	love.graphics.setColor(1, 0, 0)
	love.graphics.circle("fill", x, y, 50)
end
