# Generates a random number from 0 - 2, 0 representing scissor, 1 representing rock, and 2 representing paper
# and then asks the player to choose one and compares the results to see who wins

import random

cpuChoice = random.randint(0,2)

playerChoice = int(input("scissor (0), rock (1), paper(2): "))


if playerChoice == 0:

    if cpuChoice == 0: print("The computer is scissor. You are scissor too. It is a draw")

    elif cpuChoice == 1: print("The computer is rock. You are scissor. The computer wins")

    elif cpuChoice == 2: print("The computer is paper. You are scissor. You win")

elif playerChoice == 1:

    if cpuChoice == 0: print("The computer is scissor. You are rock. You win")

    elif cpuChoice == 1: print("The computer is rock. You are rock too. It is a draw")

    elif cpuChoice == 2: print("The computer is paper. You are rock. The computer wins")

elif playerChoice == 2:

    if cpuChoice == 0: print("The computer is scissor. You are paper. The computer wins")

    elif cpuChoice == 1: print("The computer is rock. You are paper. You win")

    elif cpuChoice == 2: print("The computer is paper. You are paper too. It is a draw")

else: print("Invalid input")
