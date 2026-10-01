#reads scores and outputs whether they are above or equal to or below average
#get the scores from user
i = input("Enter the numbers: ")

#convert i into list of floats
lst = i.split()
scores = [float(x) for x in lst]

#calculate average
total = 0
count = 0

for x in scores:

    total += x
    count += 1

average = total / count

#count how many scores are above or equal to or below average
aboveOrEqual = 0
below = 0

for x in scores:

    if x >= average:

        aboveOrEqual += 1

    else:

        below += 1

#print results
print(f"Average is {average}")
print(f"Number of scores above or equal to the average {aboveOrEqual}")
print(f"Number of scores below the average {below}")
