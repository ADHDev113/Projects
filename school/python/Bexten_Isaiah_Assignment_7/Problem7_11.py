import random

#function that shuffles a list
def shuffle(lst):

    #create new list to store shuffled values 
    shuffledList = [-1 for x in lst]

    #puts values in random indexes in the shuffledList
    for x in lst:

        unsorted = True
        while(unsorted):

            index = random.randint(0, len(lst) - 1)

            if shuffledList[index] == -1:

                shuffledList[index] = x
                unsorted = False

    return shuffledList
    
#get a list of numbers from the user
i = input("Enter numbers: ")

#convert i into a list of floats
lst = i.split()
numbers = [float(x) for x in lst]

#shuffles and prints shuffled list
print(shuffle(numbers))
