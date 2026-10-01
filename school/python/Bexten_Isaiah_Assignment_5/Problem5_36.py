# Generates a random number from 0 - 2, 0 representing scissor, 1 representing rock, and 2 representing paper
# and then asks the player to choose one and compares the results to see who wins
# plays to best of 3

import random

playerWins = 0
cpuWins = 0

while playerWins < 2 and cpuWins < 2:
    
    cpuChoice = random.randint(0,2)

    playerChoice = int(input("scissor (0), rock (1), paper(2): "))


    if playerChoice == 0:

        if cpuChoice == 0: print("The computer is scissor. You are scissor too. It is a draw")

        elif cpuChoice == 1:

            print("The computer is rock. You are scissor. The computer wins")
            cpuWins += 1

        elif cpuChoice == 2:

            print("The computer is paper. You are scissor. You win")
            playerWins += 1

    elif playerChoice == 1:

        if cpuChoice == 0:

            print("The computer is scissor. You are rock. You win")
            playerWins += 1

        elif cpuChoice == 1: print("The computer is rock. You are rock too. It is a draw")

        elif cpuChoice == 2:

            print("The computer is paper. You are rock. The computer wins")
            cpuWins += 1

    elif playerChoice == 2:

        if cpuChoice == 0:

            print("The computer is scissor. You are paper. The computer wins")
            cpuWins += 1

        elif cpuChoice == 1:

            print("The computer is rock. You are paper. You win")
            playerWins += 1

        elif cpuChoice == 2: print("The computer is paper. You are paper too. It is a draw")

    else: print("Invalid input")

if playerWins == 2:

    print("You win the best of 3")

else:

    print("The computer wins the best of 3")
