#takes a year from the user and outputs the corresponding Chinese Zodiac animal

#Make list of animals corresponding to year cycle
animals = ["monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"]

#take year from user and calculates Zodiac year
year = int(input("Enter a year:"))
zodiacYear = year % 12

#prints result
print(f"{year} is {animals[zodiacYear]}")



