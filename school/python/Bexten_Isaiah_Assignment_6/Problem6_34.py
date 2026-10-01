import math

#returns the area of a pentagon given the side length
def area(n, side):

    return (n * side ** 2) / (4 * math.tan(math.pi / n))

numOfSides = int(input("Enter the number of sides: "))
side = float(input("Enter the length of a side: "))

print("The area of the polygon is" , area(numOfSides,side))

