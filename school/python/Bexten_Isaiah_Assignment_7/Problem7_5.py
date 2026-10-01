#reads a list of ints and prints distinct numbers
#get numbers from user
i = input("Enter ten numbers: ")

#convert i into list of ints
lst = i.split()
numbers = [int(x) for x in lst]

#crete new list to store distinct numbers and counter
count = 0
distinctNums = []

for x in numbers:

    if (x in distinctNums) == False:

        count += 1
        distinctNums.append(x)

#print results
s = [str(x) for x in distinctNums]
lstOutput = " ".join(s)
print(f"The distinct numbers are: {lstOutput}")
