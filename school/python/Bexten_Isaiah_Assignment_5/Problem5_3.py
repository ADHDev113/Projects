#Displays a conversion table from kilograms to pounds
print("Kilograms    Pounds")

kilograms = 1

while kilograms < 200:

    pounds = kilograms * 2.2
    
    print(f"{kilograms}\t      {pounds:5.1f}")

    kilograms+= 2
    
