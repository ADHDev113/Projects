#Gets the subtotal and gratuity rate from the user and calculates the tip

#Gets the subtotal and gratuity rate
subtotal = float(input("Enter the subtotal: "))
rate = float(input("Enter the gratuity rate: ")) / 100

#Calcualtes gratuity and total
gratuity = subtotal * rate
total = subtotal + gratuity

gratuity *= 100
gratuity = int(gratuity)
gratuity /= 100.0

total *= 100
total = int(total)
total /= 100.0

#Prints gratuity and total
print("The gratuity is ", gratuity, " and total is ", total)
