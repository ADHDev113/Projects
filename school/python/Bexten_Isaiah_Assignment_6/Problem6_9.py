#Print a conversion table between feet and meters

import conversions

print("Feet\t\tMeters\t\t|\tMeters\t\tFeet")
print("-------------------------------------------------------------------------")

meters = 20

for feet in range(1, 11):

    m1 = conversions.footToMeter(feet)
    f1 = conversions.meterToFoot(meters)

    print(f"{feet}\t\t{m1:.3f}\t\t|\t{meters}\t\t{f1:.2f}")

    meters = meters + 5
