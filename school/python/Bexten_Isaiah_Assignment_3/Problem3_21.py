#Takes a day month and year from the user and outputs the day of the week

year = int(input("Enter year:"))
month = int(input("Enter month: 1-12: "))
day = int(input("Enter the day of the month: 1-31: "))

if month == 1:
    month = 13
    year -= 1
elif month == 2:
    month = 14
    year -= 1


    
k = year % 100
j = year // 100

h = (day + (26 * (month + 1) // 10) + k + (k // 4) + (j // 4) + 5 * j) % 7

match h:
    case 0:
        weekDay = "Saturday"
    case 1:
        weekDay = "Sunday"
    case 2:
        weekDay = "Monday"
    case 3:
        weekDay = "Tuesday"
    case 4:
        weekDay = "Wednesday"
    case 5:
        weekDay = "Thursday"
    case 6:
        weekDay = "Friday"

print(f"Day of the week is {weekDay}") 
