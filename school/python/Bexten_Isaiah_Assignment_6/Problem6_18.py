#takes side length from the user and displays a matrix of 0s and 1s

import random

def printMatrix(n):

    for i in range(0, n):

        for j in range(0, n):

            print(random.randint(0,1), end = " ")

        print()


length = int(input("Enter a side length: "))

printMatrix(length)


