import random

#plays a text based game of hangman
#create a list of possible words
words = ["write", "that", "program", "dog", "cat", "antidisestablishmentarianism", "boat", "computer", "python"]

play = True
while(play):
#pick a random word from the list
    word = words[random.randint(0, len(words) - 1)]
    letters = list(word)

#create a list for correctly guessed letters
    correctlyGuessed = ['*' for x in letters]

#starts the game loop
    misses = 0
    notGuessed = True

    while(notGuessed):

#convert correectlyGuessed to string
        guessed = "".join(correctlyGuessed)
#print the letters already guessed correctly and prompt user to enter guess
        guess = input(f"(Guess) Enter a letter in word {guessed} > ")

#if the guess is correct, change the correctlyGuessed list to reflect
        if guess in letters:

            index = 0
            for x in letters:

                if guess == x:

                    correctlyGuessed[index] = guess

                index += 1

#add to misses if guess is incorrect
        else:

            misses += 1

#check for win
        if correctlyGuessed == letters:
                notGuessed = False
                
#print results
    if misses > 1:

        print(f"The word is {word}. You missed {misses} times")

    else:

        print(f"The word is {word}. You missed {misses} time")

#asks if user wants to play again
    playAgain = input("Do you want to guess for another word? Enter y or n> ")

    if playAgain != 'y':
        play = False
        

    
        
                
