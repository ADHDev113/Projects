#Picks a random poker card out of a deck

import random

rank = random.randint(1,13)
suit = random.randint(0,3)

if rank == 1:
    rank = "Ace"
elif rank == 11:
    rank = "Jack"
elif rank == 12:
    rank = "Queen"
elif rank == 13:
    rank = "King"

if suit == 0:
    suit = "Spades"
elif suit == 1:
    suit = "Hearts"
elif suit == 2:
    suit = "Clubs"
elif suit == 3:
    suit = "Diamonds"

print(f"The card you picked is {rank} of {suit}")




