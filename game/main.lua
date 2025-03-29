function love.load()
  -- Load the test module
end

function love.update(dt)
  -- Update the test module
end

function love.draw()
  -- Draw the test module
  love.graphics.rectangle("line", 200, 400, 200, 100)
  love.graphics.circle("line", 400, 300, 50)
  love.graphics.polygon("line", 100, 100, 200, 100, 150, 200) 
end
