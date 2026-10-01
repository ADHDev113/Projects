#Gets the temperature and wind speed from a user and prints the wind chill

temperature = float(input("Enter the temperature in Fahrenheit between -58 and 41: "))
windSpeed = float(input("Enter the wind speed in miles per hout (must be greater than or equal to 2): "))

windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * windSpeed ** 0.16 + 0.4275 * temperature * windSpeed ** 0.16

print("The wind chill index is", windChillIndex)
