#Takes the radius and length of a cylinder and outputs the volume

#Takes the radius and length from the user
radius = float(input("Enter the radius of a cylinder: "))
length = float(input("Enter the length of a cylinder: "))

#Calculates the area and volume
area = radius * radius * 3.14159
volume = area * length

#Prints the are and volume
print("The area is ", area)
print("The volume of the cylinder is ", volume)
