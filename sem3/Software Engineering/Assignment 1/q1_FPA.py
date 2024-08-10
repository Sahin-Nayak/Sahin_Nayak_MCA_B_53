# ar = [[0 for _ in range(4)] for _ in range(6)]

# ar[0][0] = int(input("Enter Initial Value of Input: "))
# ar[1][0] = int(input("Enter Initial Value of File: "))
# ar[2][0] = int(input("Enter Initial Value of Query: "))
# ar[3][0] = int(input("Enter Initial Value of Interface: "))
# ar[4][0] = int(input("Enter Initial Value of Output: "))

# w1 = float(input("Enter Weighing Factor of Simple: "))
# w2 = float(input("Enter Weighing Factor of Average: "))
# w3 = float(input("Enter Weighing Factor of Complex: "))

# print("Enter Input Ratio of 'Input': ")
# inputt = input()
# if ":" in inputt:
#     temp = inputt.split(":")
#     ar[0][1] = int(temp[0]) * ar[0][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[0][2] = int(temp[1]) * ar[0][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[0][3] = int(temp[2]) * ar[0][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
# elif inputt == "simple":
#     ar[0][1] = ar[0][0]
# elif inputt == "average":
#     ar[0][2] = ar[0][0]
# else:
#     ar[0][3] = ar[0][0]

# print("Enter Input Ratio of 'File': ")
# inputt = input()
# if ":" in inputt:
#     temp = inputt.split(":")
#     ar[1][1] = int(temp[0]) * ar[1][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[1][2] = int(temp[1]) * ar[1][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[1][3] = int(temp[2]) * ar[1][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
# elif inputt == "simple":
#     ar[1][1] = ar[1][0]
# elif inputt == "average":
#     ar[1][2] = ar[1][0]
# else:
#     ar[1][3] = ar[1][0]

# print("Enter Input Ratio of 'Query': ")
# inputt = input()
# if ":" in inputt:
#     temp = inputt.split(":")
#     ar[2][1] = int(temp[0]) * ar[2][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[2][2] = int(temp[1]) * ar[2][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[2][3] = int(temp[2]) * ar[2][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
# elif inputt == "simple":
#     ar[2][1] = ar[2][0]
# elif inputt == "average":
#     ar[2][2] = ar[2][0]
# else:
#     ar[2][3] = ar[2][0]

# print("Enter Input Ratio of 'Interface': ")
# inputt = input()
# if ":" in inputt:
#     temp = inputt.split(":")
#     ar[3][1] = int(temp[0]) * ar[3][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[3][2] = int(temp[1]) * ar[3][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[3][3] = int(temp[2]) * ar[3][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
# elif inputt == "simple":
#     ar[3][1] = ar[3][0]
# elif inputt == "average":
#     ar[3][2] = ar[3][0]
# else:
#     ar[3][3] = ar[3][0]

# print("Enter Input Ratio of 'Output': ")
# inputt = input()
# if ":" in inputt:
#     temp = inputt.split(":")
#     ar[4][1] = int(temp[0]) * ar[4][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[4][2] = int(temp[1]) * ar[4][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
#     ar[4][3] = int(temp[2]) * ar[4][0] // (int(temp[0]) + int(temp[1]) + int(temp[2]))
# elif inputt == "simple":
#     ar[4][1] = ar[4][0]
# elif inputt == "average":
#     ar[4][2] = ar[4][0]
# else:
#     ar[4][3] = ar[4][0]

# ar[5][1] = sum([ar[i][1] for i in range(5)])
# ar[5][2] = sum([ar[i][2] for i in range(5)])
# ar[5][3] = sum([ar[i][3] for i in range(5)])

# print("Enter Features of the Product (Enter 00 to Stop): ")
# arr = []
# temp = input()
# while temp != "00":
#     arr.append(temp)
#     temp = input()

# ufp = w1 * ar[5][1] + w2 * ar[5][2] + w3 * ar[5][3]
# print(f"Un-adjusted Function Point: {ufp}")

# tdi = 0
# for i in arr:
#     if "%" in i:
#         tdi += float(i[:-1]) / 100
#     else:
#         tdi += float(i)
# print(f"Total Degree of Influence: {tdi}")

# vaf = 0.01 * tdi + 0.65
# print(f"Value Added Factor: {vaf}")

# afp = vaf * ufp
# print(f"Adjusted Function Point: {afp}")


ar = [[0 for _ in range(4)] for _ in range(6)]
categories = ["Input", "File", "Query", "Interface", "Output"]

for i, category in enumerate(categories):
    ar[i][0] = int(input(f"Enter Initial Value of '{category}': "))

w1 = float(input(f"Enter Weighing Factor of Simple (default 0.5): ") or 0.5)
w2 = float(input(f"Enter Weighing Factor of Average (default 1.0): ") or 1.0)
w3 = float(input(f"Enter Weighing Factor of Complex (default 1.5): ") or 1.5)

for i, category in enumerate(categories):
    inputt = input(f"Enter Input Ratio of '{category}': ")
    if ":" in inputt:
        temp = list(map(int, inputt.split(":")))
        total = sum(temp)
        for j in range(3):
            ar[i][j + 1] = temp[j] * ar[i][0] // total
    else:
        j = ["simple", "average", "complex"].index(inputt.lower())
        ar[i][j + 1] = ar[i][0]

ar[5][1:] = [sum(ar[i][j] for i in range(5)) for j in range(1, 4)]

print("Enter Features of the Product (Enter 00 to Stop): ")
arr = []
while (temp := input()) != "00":
    arr.append(temp)

print("Full Table: ")
for i in range(6):
    for j in range(4):
        print(ar[i][j], end=" ")
    print()

print()

ufp = sum(w * ar[5][i + 1] for i, w in enumerate([w1, w2, w3]))
print(f"Un-adjusted Function Point: {ufp}")

tdi = sum(float(i[:-1]) / 100 if "%" in i else float(i) for i in arr)
print(f"Total Degree of Influence: {tdi}")

vaf = 0.01 * tdi + 0.65
print(f"Value Added Factor: {vaf}")

afp = vaf * ufp
print(f"Adjusted Function Point: {afp}")
