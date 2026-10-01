
import random

#rolls two dice and prints and returns the result
def rollDice():

    d1 = random.randint(1,6)
    d2 = random.randint(1,6)

    total = d1 + d2
    
    return total

#function to play a game of craps
def playCraps():
    #declare variable
    points = 0
    lose = False
    win = False

    #play craps
    while(points < 7 and lose == False and win == False):

        roll = rollDice()

        if(roll == 2 or roll == 3 or roll == 12):

            lose = True

        elif(roll == 7 or roll == 11):

            win = True

        else:

            points = points + 1

    if(win):

        return True


#plays craps 10,000 times and displays number of wins
wins = 0
for i in range(0, 10000):

    if(playCraps()):
        wins = wins + 1

print("Wins: ", wins)
    
