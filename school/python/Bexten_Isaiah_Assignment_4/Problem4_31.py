#Takes a hex digit from the user and prints the corresponding binary for the digit

hexDigit = input("Enter a hex character: ").upper()

if hexDigit <= 'F' and hexDigit >= 'A':
    hexValue = ord(hexDigit) - ord('A') + 10
    print(f"The binary value is {hexValue:04b}")
else:
    hexValue = int(hexDigit)
    print(f"The binary value is {hexValue:04b}")
