#Generates a random string of three uppercase letters
import random

s = chr(random.randint(65, 90))
s += chr(random.randint(65, 90))
s += chr(random.randint(65, 90))

print(s)
