#Takes a letter from the user and displays the corresponding keypad number

letter = input("Enter an uppercase letter: ")

match letter:
    case 'A' | 'B' | 'C':
        number = 2
    case 'D' | 'E' | 'F':
        number = 3
    case 'G' | 'H' | 'I':
        number = 4
    case 'J' | 'K' | 'L':
        number = 5
    case 'M' | 'N' | 'O':
        number = 6
    case 'P' | 'Q' | 'R' | 'S':
        number = 7
    case 'T' | 'U' | 'V':
        number = 8
    case 'W' | 'X' | 'Y' | 'Z':
        number = 9

print("The corresponding number is", number)
