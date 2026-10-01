#Takes a letter indicating major and a number indicating year from the user and outputs major and year as words

chars = input("Enter two characters: ")

match chars[0]:
    case 'M':
        major = "Mathematics"
    case 'C':
        major = "Computer Science"
    case 'I':
        major = "Information Technology"

match chars[1]:
    case '1':
        year = "Freshman"
    case '2':
        year = "Sophomore"
    case '3':
        year = "Junior"
    case '4':
        year = "Senior"

print(major + "\n" + year)
