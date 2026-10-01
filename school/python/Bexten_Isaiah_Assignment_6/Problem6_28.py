#rolls two dice and prints and returns the result

import random

def rollDice():

    d1 = random.randint(1,6)
    d2 = random.randint(1,6)

    total = d1 + d2
    
    print(f"You rolled {d1} + {d2} = {total}")
    return total

points = 0
lose = False
win = False

while(points < 7 and lose == False and win == False):

    roll = rollDice()

    if(roll == 2 or roll == 3 or roll == 12):

        lose = True

    elif(roll == 7 or roll == 11):

        win = True

    else:

        points = points + 1
        print(f"You have {points} points")

if(lose):

    print("You lose")

else:

    print("You win")




        
    
