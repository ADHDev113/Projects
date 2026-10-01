#takes a triangle from a user and outputs the area

import MyTriangle

side1 = float(input("Enter edge1: "))
side2 = float(input("Enter edge2: "))
side3 = float(input("Enter edge3: "))

if(MyTriangle.isValid(side1, side2, side3)):
    
    area = MyTriangle.area(side1, side2, side3)

    print(f"The area of the triangle is {area}")

else:

    print("Invalid triangle")
