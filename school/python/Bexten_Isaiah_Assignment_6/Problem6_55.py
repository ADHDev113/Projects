#takes a letter from the user and returns the corresponding keypad number

def getNumber(uppercaseLetter):

    match uppercaseLetter:

        case 'A' | 'B' | 'C':
            return '2'
        case 'D' | 'E' | 'F':
            return '3'
        case 'G' | 'H' | 'I':
            return '4'
        case 'J' | 'K' | 'L':
            return '5'
        case 'M' | 'N' | 'O':
            return '6'
        case 'P' | 'Q' | 'R' | 'S':
            return '7'
        case 'T' | 'U' | 'V':
            return '8'
        case 'W' | 'X' | 'Y' | 'Z':
            return '9'

number = input("Enter a string: ")
number = number.upper()

replaced = ""
for i in range(0, len(number)):

    if(64 < ord(number[i]) < 91):

        replaced = replaced + getNumber(number[i])

    else:

        replaced = replaced + number[i]

print(replaced)
