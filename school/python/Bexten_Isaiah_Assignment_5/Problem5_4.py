#Prints a conversion table from miles to kilometers

print("Miles\tKilometers")

for miles in range(1, 11):

    kilometers = miles * 1.609

    print(f"{miles}\t{kilometers:.3f}")
