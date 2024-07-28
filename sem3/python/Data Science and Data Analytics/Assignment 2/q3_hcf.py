def hcf(a, b):
    if b==0:
        return a
    else:
        return hcf(b, a % b)


a = int(input("Enter First Number: "))
b = int(input("Enter Second Number: "))
print(f"HCF of {a} and {b} is: {hcf(a,b)}")
