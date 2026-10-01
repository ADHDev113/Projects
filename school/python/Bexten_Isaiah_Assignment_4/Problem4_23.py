#Takes a letter grade from user and displays a corresponding numeric value

letterGrade = input("Enter a letter grade: ")

match letterGrade:
    case 'A' | 'a':
        value = 4
    case 'B' | 'b':
        value = 3
    case 'C' | 'c':
        value = 2
    case 'D' | 'd':
        value = 1
    case 'F' | 'f':
        value = 0
        
print(f"The numeric value for grade {letterGrade} is {value}")       

    
