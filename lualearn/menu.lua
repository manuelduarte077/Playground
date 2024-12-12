function Option1()
	print("Option 1: Hello World!")
end

function Option2()
	io.write("Option 2: Enter your name: ")
	local name = io.read()
	print("Hello, " .. name .. "!")
end

function Option3()
	print("Option 3: Goodbye!")
	os.exit()
end

-- Menu de opciones --
print("Option 2: Hello World!")
while true do
	print("1. Option 1")
	print("2. Option 2")
	print("3. Option 3")
	io.write("Choose an option: ")
	local option = io.read()
	if option == "1" then
		Option1()
	elseif option == "2" then
		Option2()
	elseif option == "3" then
		Option3()
	else
		print("Invalid option!")
	end
end
