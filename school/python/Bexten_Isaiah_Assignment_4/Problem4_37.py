#Generates a random vehicle plate number consisting of three Uppercase letters followed by four digits
import random

plateNumber = chr(random.randint(65, 90))
plateNumber += chr(random.randint(65, 90))
plateNumber += chr(random.randint(65, 90))
plateNumber += chr(random.randint(48, 57))
plateNumber += chr(random.randint(48, 57))
plateNumber += chr(random.randint(48, 57))
plateNumber += chr(random.randint(48, 57))

print("A random vehicle plate number: ", plateNumber)
