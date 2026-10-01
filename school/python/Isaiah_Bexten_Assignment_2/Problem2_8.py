# Takes an initial temperature, final temperature, and an amount of water and prints the amount of energy needed to 
# heat from the inital to the final temperature

# Gets the amount of water, initial temperature, and final temperature from the user
amountOfWater = float(input("Enter the amount of water in kilograms: "))
initialTemperature = float(input("Enter the initial temperature: "))
finalTemperature = float(input("Enter the final temperature: "))

# Calculates the amount of energy needed
energyNeeded = amountOfWater * (finalTemperature - initialTemperature) * 4184

# Prints the amount of energy needed
print("The energy needed is", energyNeeded)
