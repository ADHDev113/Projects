#Takes student names and scores from a user and prints the highest two scores

students = int(input("Enter the number of students: "))

highestScore1 = 0
name1 = ""
highestScore2 = 0
name2 = ""

for i in range(0, students):

    name = input("Enter a student name: ")
    score = float(input("Enter a student score: "))

    if score > highestScore1:

                  highestScore2 = highestScore1
                  name2 = name1
                  highestScore1 = score
                  name1 = name

    elif score > highestScore2:

        highestScore2 = score
        name2 = name


print("Top two students:")
print(f"{name1}'s score is {highestScore1}\n{name2}'s score is {highestScore2}")

        
