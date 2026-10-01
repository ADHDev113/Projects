# Converts currency between U.S. dollars and Chinese Renminbi (RMB)

#Gets the exchange rate from the user
exchangeRate = float(input("Enter the exchange rate from dollars to RMB: "))

#prompts the user to decide whether to convert from dollars to RMB or vice versa
choice = int(input("Enter 0 to convert from dollars to RMB and 1 vice versa: "))

#converts depending on choice and prints the result
if choice == 0:

    amount = float(input("Enter the dollar amount: "))
    rmb = amount * exchangeRate
    print(f"{amount:.2f} dollars is {rmb:.2f} Yuan")

if choice == 1:

    amount = float(input("Enter the RMB amount: "))
    dollars = amount / exchangeRate
    print(f"{amount:.2f} Yuan is {dollars:.2f} dollars")
