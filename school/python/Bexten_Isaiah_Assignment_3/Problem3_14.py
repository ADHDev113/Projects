# Flips a coin and lets the user guess whether it's heads or tails then displays the correctness

import random

coinflip = random.randint(0,1)

guess = int(input("Guess head or tail?\nEnter 0 for head and 1 for tail: "))

if guess == coinflip:

            if guess == 0:
            
                print("Yes, it is a head!")

            else:
                
                print("Yes, it is a tail!")
                
elif coinflip == 0:
    
    print("Sorry, it is a head")
    
else:

    print("Sorry, it is a tail")
    
