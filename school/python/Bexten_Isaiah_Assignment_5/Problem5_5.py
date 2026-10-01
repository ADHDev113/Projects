#Displays a conversion table from kilograms to pounds beside a conversion table from pounds to kilograms
print("Kilograms\tPounds\t|\tPounds\tKilograms")

kilograms = 1
pounds = 20

for i in range(1, 101):

    print(f"{kilograms}\t\t{kilograms * 2.2:.1f}\t|\t{pounds}\t{pounds / 2.2:.2f}")

    kilograms += 2
    pounds += 5
