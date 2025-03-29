print(type("What is my type"))
t = 10

print(t)

print(type(print))

local result

-- define a function to compute max of two numbers
function max(num1, num2)

  if (num1 > num2) then
     result = num1;
  else
     result = num2;
  end

  return result;
end

-- get the type of a function
print("The type of the function ",type(max))

-- get the type of result of function
print("The type of the function ",type(max(3,4)))

-- get the result of function
print("The Max Value: ",max(6,4))