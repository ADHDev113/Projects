#prints a conversion table between celcius and fahrenheit

import conversions

print("Celcius\t\tFahrenheit\t|\tFahrenheit\tCelcius")
print("---------------------------------------------------------------")

fahrenheit = 120
for celcius in range(40, 30, -1):

    f1 = conversions.celsiusToFahrenheit(celcius)
    c1 = conversions.fahrenheitToCelcius(fahrenheit)
    print(f"{celcius}\t\t{f1:.2f}\t\t|\t{fahrenheit}\t\t{c1:.2f}")
    fahrenheit = fahrenheit - 10
