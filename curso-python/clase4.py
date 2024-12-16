# Strings
name = "John Doe"
lastName = """Doe"""
address = str(123) + " Main Street"

print(name)  # John Doe
print(lastName)  # Doe
print(address)  # 123 Main Street

print(type(name))  # <class 'str'>
print(type(lastName))  # <class 'str'>
print(type(address))  # <class 'str'>


# index
print(name[0])  # J
print(name[1])  # o
print(name[-1])  # e

# slicing
print(name[0:4])  # John

# concatenation
full_name = name + " " + lastName
print(full_name)  # John Doe

# repetition
print(name * 2)  # John DoeJohn Doe

# length
print(len(name))  # 8
