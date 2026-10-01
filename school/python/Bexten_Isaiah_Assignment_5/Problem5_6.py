#Prints a converstion table from miles to kilometers beside a table from kilometers to miles

print("Miles\tKilometers\t|\tKilometers\tMiles")

miles = 1
kilometers = 20

for i in range(1, 11):

    print(f"{miles}\t{miles * 1.609:.3f}\t|\t{kilometers}\t{kilometers / 1.609:.3f}")

    miles += 1
    kilometers += 5
