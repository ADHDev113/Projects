import random

#generates 1000 random integers 0-9 and counts each number
#create list for counts and generate numbers
counts = [0 for x in range(0, 10)]

for i in range(0, 1001):

    x = random.randint(0, 9)
    counts[x] += 1

#print results
index = 0
for x in counts:

    print(f"{index}s: {x}")
    index += 1
