# Converts an amount of money into cash and coins

# Receive the amount
amount = int(input("Enter an amount as integer, e.g., 1156 for 11 dollars 56 cents: "))

# assign amount to remainingAmount
remainingAmount = amount

# Find the number of one dollars
numberOfOneDollars = remainingAmount // 100
remainingAmount = remainingAmount % 100

# Find the number of quarters in the remaining amount
numberOfQuarters = remainingAmount // 25
remainingAmount = remainingAmount % 25

# Find the number of dimes in the remaining amount
numberOfDimes = remainingAmount // 10
remainingAmount = remainingAmount % 10

# Find the number of nickels in the remaining amount
numberOfNickels = remainingAmount // 5
remaining = remainingAmount % 5

# Find the number of pennies in remaining amount
numberOfPennies = remainingAmount

# Display results
print("Your amount", amount, "consists of")
print("  ", numberOfOneDollars, "dollars")
print("  ", numberOfQuarters, "quarters")
print("  ", numberOfDimes, "dimes")
print("  ", numberOfNickels, "nickles")
print("  ", numberOfPennies, "pennies")
