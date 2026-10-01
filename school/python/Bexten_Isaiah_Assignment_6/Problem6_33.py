import math

#returns the area of a pentagon given the side length
def area(s):

    return (6 * s ** 2) / (4 * math.tan(math.pi / 6))

side = float(input("Enter the side: "))

print("The area of the hexagon is" , area(side))

