#Gets the temperature and wind speed from a user and prints the wind chill

temperature = float(input("Enter the temperature in Fahrenheit: "))
windSpeed = float(input("Enter the wind speed in miles per hour: "))

if temperature < 41 and temperature > -58 and windSpeed >= 2:
    
    windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * windSpeed ** 0.16 + 0.4275 * temperature * windSpeed ** 0.16
    print("The wind chill index is", windChillIndex)

elif temperature > 41 or temperature < -58:

    print("temperature is invalid")

else:

    print("wind speed is invalid")
