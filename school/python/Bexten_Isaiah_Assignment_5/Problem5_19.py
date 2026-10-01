#Displays a pyramid with a number of layers defined by the user

layers = int(input("Enter the number of lines: "))

for i in range(1, layers + 1):

    for j in range(0, layers - i):
            print("  ", end = ' ')

    for k in range(i, 0, -1):    
        print(f"{k:2.0f}", end = ' ')

    for l in range(2, i + 1):
        print(f"{l:2.0f}", end = ' ')

    print()
