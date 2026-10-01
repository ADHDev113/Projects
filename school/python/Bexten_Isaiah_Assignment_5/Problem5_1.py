#define the variables
i = 1
total = 0
count = 0
negatives = 0
positives = 0

while i != 0:

# Take integers from the user 
   i = int(input("Enter and integer, the input ends if it is 0: "))

   if i != 0:
# calculate current total and count
       total += i
       count += 1

# count the positive and negative integers
       if i < 0:
           negatives += 1
       elif i > 0:
            positives += 1

#Calculates average and displays results to user
average = total / count

print(f"The number of positives is {positives}")
print(f"The number of negatives is {negatives}")
print(f"The total is {total}")
print(f"The average is {average}")
        
        

       
