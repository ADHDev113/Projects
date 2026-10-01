#reads a list of integers and prints the reversed list

#get the list from user
i = input("Enter numbers seperated by spaces from one line: ")

#converts i into a list
lst = i.split()

#prints the list in reverse order
print("The reversed list is", end = " ")
for x in range(len(lst) - 1, -1, -1):
    print(lst[x], end = " ")

    
