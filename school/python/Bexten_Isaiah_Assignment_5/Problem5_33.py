#Takes amount, annual percentage yield, and number of months from user and displays a cd value table

amount = float(input("Enter the initial deposit amount: "))
MonthlypercentageYield = float(input("Enter annual percentage yield: ")) / 100 / 12
numberOfMonths = int(input("Enter maturity period (number of months): "))

print("Month\t\tCD Value")

cdValue = amount

for i in range(1, numberOfMonths + 1):

    cdValue += cdValue * MonthlypercentageYield
    
    print(f"{i}\t\t{cdValue:.2f}")
