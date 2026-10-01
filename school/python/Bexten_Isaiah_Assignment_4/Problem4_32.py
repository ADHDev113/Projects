#Takes an integer from 0 to 15 and displays the hex character corresponding to that value

value = int(input("Enter a decimal integer value (0 to 15): "))

if value > 9 and value <= 15:
    hexChar = chr(value - 10 + ord('A'))
elif value <= 9 and value >= 0:
    hexChar = value
else:
    print("Invalid input")

print("The hex value is", hexChar)
