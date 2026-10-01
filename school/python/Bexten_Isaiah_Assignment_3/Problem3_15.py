#Description: Develop a program to play a 3 digit lottery
'''
Rule 1: If the user's input matches the lottery in the
exact order, award 10,000 dollars

Rule 2: If all the digits in the user's input matches
all the digits in the lottery number, award 3,000 dollars

Rule 3: If one digit in the user's input matches a digit
in the lottery number, award 1,000 dollars
'''
#Import the random module
import random

#Generate a lottery number
lottery = random.randint(100,999)

#Prompt the user to enter a guess
guess = int(input("Enter your lottery pick(3 digits): "))

#Get the digits from lottery
lDigit1 = lottery // 100 #Obtains the first digit
lDigit2 = lottery // 10 % 10 #Obtains the second digit
lDigit3 = lottery % 10 #Obtains the third digit

#Get the digits from guess
gDigit1 = guess // 100
gDigit2 = guess // 10 % 10
gDigit3 = guess %10

#Display the winning lottery numbers
print("The Winning Lottery Number is", lottery)

#Create a multi-way to check the guess
if guess == lottery:
    print("Exact match: You win $10,000")

elif (gDigit1 == lDigit1 or gDigit1 == lDigit2 or gDigit1 == lDigit3 or
      gDigit2 == lDigit1 or gDigit2 == lDigit2 or gDigit2 == lDigit3 or
      gDigit3 == lDigit1 or gDigit3 == lDigit2 or gDigit3 == lDigit3):

    if gDigit1 == lDigit1 or gDigit1 == lDigit2 or gDigit1 == lDigit3:

        if gDigit1 == lDigit1: lDigit1 = 10
        elif gDigit1 == lDigit2: lDigit2 = 10
        elif gDigit1 == lDigit3: lDigit3 = 10

        if gDigit2 == lDigit1 or gDigit2 == lDigit2 or gDigit2 == lDigit3:

            if gDigit2 == lDigit1: lDigit1 = 10
            elif gDigit2 == lDigit2: lDigit2 = 10
            elif gDigit2 == lDigit3: lDigit3 = 10

            if gDigit3 == lDigit1 or gDigit3 == lDigit2 or gDigit3 == lDigit3: print("Match all digits: You win $3,000")

            else: print("Match one digit: You win $1,000")

        else: print("Match one digit: You win $1,000")

    else: print("Match one digit: You win $1,000")
                
        
else:
    print("Sorry, better luck next time")
















