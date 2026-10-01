#lets the user enter the loan amount, number of years, and interest rate, and
#then displays the amortization schedule for the loan.
loanAmount = float(input("Enter loan ammount, for example 120000.95: "))
numberOfYears = int(input("Enter number of years as an integer, for example 5: "))
yearlyInterestRate = float(input("Enter yearly interest rate, for example 8.25: "))

monthlyInterestRate = yearlyInterestRate / 100 / 12

#Calculate monthly payment and total payment
monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / (1 + monthlyInterestRate) ** (numberOfYears * 12))
totalPayment = monthlyPayment * 12 * numberOfYears

#print the monthly payment and total payment
print(f"Monthly Payment: {monthlyPayment:.2f}")
print(f"Total Payment: {totalPayment:.2f}")

#print the amortization schedule
print("Payment#\tInterest\tPrincipal\tBalance")

balance = loanAmount

for i in range(1, numberOfYears * 12 + 1):

    interest = monthlyInterestRate * balance
    principal = monthlyPayment - interest
    balance = balance - principal
    
    print(f"{i}\t\t{interest:.2f}\t\t{principal:.2f}\t\t{balance:.2f}")
