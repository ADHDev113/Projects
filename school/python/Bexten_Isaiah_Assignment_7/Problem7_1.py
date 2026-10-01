#Takes number grades from the user and assigns letter grades to students

#read grades
i = input("Enter scores seperated by spaces from on line: ")

#converts i into a list of numbers
lst = i.split()
grades = [float(x) for x in lst]

#find the best grade
best = 0
for x in grades:
    if x > best:
        best = x

#calculate and print letter grades
count = 0
for x in grades:
    if x >= best - 10:
        print(f"student {count} score is {x} and grade is A")

    elif x >= best - 20:
        print(f"student {count} score is {x} and grade is B")

    elif x >= best - 30:
        print(f"student {count} score is {x} and grade is C")

    elif x >= best - 40:
        print(f"student {count} score is {x} and grade is D")

    else:
        print(f"student {count} score is {x} and grade is F")

    count = count + 1
    


