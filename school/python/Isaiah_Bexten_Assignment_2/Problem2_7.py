# Gets an amount of minutes from a user and converts it into years and days

minutes = int(input("Enter the number of minutes: "))

days = minutes // 1440
years = days // 365
days -= years * 365

 print(minutes, "minutes is approximately", years, "years and", days, "days")
