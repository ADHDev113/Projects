#Takes information about an employee from the user and prints a payroll statement

#Takes all information from the user
name = input("Enter employee's name: ")
hours = float(input("Enter number of hours worked in a week: "))
payRate = float(input("Enter hourly pay rate: "))
federalTax = float(input("Enter federal tax withholding rate: "))
stateTax = float(input("Enter state tax withholding rate: "))

#Does calculations for values
grossPay = hours * payRate
federalWithholding = federalTax * grossPay
stateWithholding = stateTax * grossPay
totalDeduction = federalWithholding + stateWithholding
netPay = grossPay - totalDeduction

#Prints payroll statement
print(f"\nEmployee Name: {name}\nHours Worked: {hours}\nPay Rate: ${payRate:.2f}\nGross Pay: ${grossPay:.2f}")
print(f"Deductions:\n  Federal Withholding ({federalTax:.1%}): ${federalWithholding:.2f}")
print(f"  State Withholding ({stateTax:.1%}): ${stateWithholding:.2f}")
print(f"  Total Deduction: ${totalDeduction:.2f}\nNet Pay:  ${netPay:.2f}")
