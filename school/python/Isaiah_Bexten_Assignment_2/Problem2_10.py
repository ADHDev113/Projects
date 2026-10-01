# Gets an airplane's acceleration and take-off speed and outputs the minimum runway length for takeoff

speed = float(input("Enter Speed: "))
acceleration = float(input("Enter acceleration: "))

length = speed ** 2 / (2 * acceleration)

print("The minimum runway length for this airplane is", length)
