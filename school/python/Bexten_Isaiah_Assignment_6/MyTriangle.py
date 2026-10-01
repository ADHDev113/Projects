import math

#Return true if the sum of any two sides is
#greater than the third side
def isValid(side1, side2, side3):

    if(side1 + side2 > side3 and side1 + side3 > side2 and side2 + side3 > side1):
        return True
    else:
        return False

#Return the area of the triangle
def area(side1, side2, side3):

        s = (side1 + side2 + side3) / 2
        return math.sqrt(s *(s - side1) * (s - side2) * (s - side3))


