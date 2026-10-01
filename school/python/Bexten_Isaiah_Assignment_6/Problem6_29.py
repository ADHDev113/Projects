#Functions

#Return true if the card number is valid
def isValid(number):

    if(getSize(number) < 17 and getSize(number) > 12):

        if(prefixMatched(number, 4) or prefixMatched(number, 5) or prefixMatched(number, 37) or prefixMatched(number, 6)):

           if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0):

               return True

           else:
                return False

        else:
            return False

    else:
        return False
           

#Get the result from Step 2
def sumOfDoubleEvenPlace(number):
    total = 0
    
    for i in range(2, getSize(number) + 2, 2):

        double = int(number % (10 ** i) / 10 ** (i - 1)) * 2

        total = total + getDigit(double)

    return total
        

#Return this number if it is a single digit, otherwise, returnn
#the sum of the two digits
def getDigit(number):

    if(int(number / 10) > 0):

       digit1 = int(number / 10)
       digit2 = number % 10

       return digit1 + digit2

    else:

        return number

#Return sum of odd place digits in number
def sumOfOddPlace(number):
     total = 0

     for i in range(1, getSize(number), 2):

        digit = int(number % (10 ** i) / 10 ** (i - 1)) 

        total = total + digit

     return total

#Return true if the digit d is a prefix for number
def prefixMatched(number, d):

    if(getPrefix(number, getSize(d)) == d):

        return True

    else:

        return False

#Return the number of digits in d
def getSize(d):
    return len(str(d))

#Return the first k number of digits from number. If the
#number of digits in number is less than k, return number
def getPrefix(number, k):

    length = getSize(number)

    return int(number / (10 ** (length-k)))





number = int(input("Enter a credit card number as an integer: "))

if(isValid(number)):

    print(number, "is valid")

else:

    print(number, "is not valid")


