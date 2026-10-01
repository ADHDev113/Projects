#reads integers from an input and counts occurences of each
#get integers from user
i = input("Enter the integers between 1 and 100: ")

#convert i into a list of ints
lst = i.split()
ints = [int(x) for x in lst]

#create list for counts and count the occurences
counts = [0 for x in range(0, 100)]
for x in ints:
    counts[x] += 1

#print the counts
index = 0
for x in counts:

    if x > 0:

        if x > 1:
        
            print(f"{index} occurs {x} times")

        else:

            print(f"{index} occurs {x} time")

    index += 1


