import random

# 1. Generate two random single-digit integers
number1 = random.randint(0, 9)
number2 = random.randint(0, 9)

#2. If number1 < number2, swap number1 with number2
if number1 < number2:
    number1, number2 = number2, number1

#3. Prompt the student to answer What is number1 - number2?
answer = int(input("What is " + str(number1) + " - "
    + str(number2) + "? "))

answers = [answer]

#5. repeatedly ask the user the question until it is correct
while number1 - number2 != answer:
    answer = int(input("Wrong answer. Try again. What is "
        + str(number1) + " - " + str(number2) + "? "))

#alerts the user if answer was already tried
    if answer in answers:
        print(f"You already entered {answer}.")
    else:
        answers.append(answer)

print("You got it!")
