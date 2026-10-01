#Takes three edges of a triangle from the user and calculates the perimeter

edge1 = float(input("Enter edge1: "))
edge2 = float(input("Enter edge2: "))
edge3 = float(input("Enter edge3: "))

if edge1 + edge2 > edge3 and edge1 + edge3 > edge2 and edge2 + edge3 > edge1:

    perimeter = edge1 + edge2 + edge3
    print(f"The perimeter is {perimeter}")

else:

    print("input is invalid")
