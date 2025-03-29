local a = 10

while (a > 20) do
  print("value of a:", a)
  a = a + 1;
end


local numbers = { 10, 20, 30, 40, 50 }
local index = 1

while (index <= 2) do
  print("value of item:", numbers[index])
  index = index + 1
end


for i = 10, 19, 1
do
  print(i)
end

local num, i = 1, 1

local write = io.write

-- outer for loop
for num = 1, 10, 1
do
  write("Table of ", num, " is : ")
  for i = 1, 10, 1
  do
    write(num * i, " ")
  end
  print()
end


numbers = { 20, 10, 30, 40, 50, 65, 12, 11 }

for i, v in ipairs(numbers) do
  print(i, v)
end


local days

days = {
  ["Mon"] = "Monday",
  ["Tue"] = "Tuesday",
  ["Wed"] = "Wednesday",
  ["Thu"] = "Thursday",
  ["Fri"] = "Friday",
  ["Sat"] = "Saturday",
  ["Sun"] = "Sunday"
}

for i, v in pairs(days) do
  print(i, v)
end


local a = 31;
local b = 20;

if (a < 30)
then
  print("a < 30")
else
  if (b > 9)
  then
    print("a > 30 and b > 9");
  end
end
