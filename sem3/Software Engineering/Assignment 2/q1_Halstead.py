import math
from typing import Counter


file = open(
    "Sem3\\Software Engineering\\Assignment 2\\test.txt",
    "r",
)


a = file.readlines()
temp = []
for i in a:
    temp.extend(i.split())
d = Counter(temp)
operators_list = [
    "=",
    "+",
    "-",
    "*",
    "/",
    ";",
    ",",
    "<",
    ">",
    "<=",
    ">=",
    "%",
    "!",
    "(",
    "{",
    "[",
]
if ")" in d:
    del d[")"]
if "}" in d:
    del d["}"]
if "]" in d:
    del d["]"]
operands = 0
operand_number = 0
operators = 0
operator_number = 0
for k, v in d.items():
    if k in operators_list:
        operators += 1
        operator_number += v
    else:
        operands += 1
        operand_number += v
n = operators + operands
N = operator_number + operand_number
print(f"Number of Operators (n1): {operators}")
print(f"Number of Operands (n2): {operands}")
print(f"Token Number (n): {n}")
print(f"Total Number of Operators (N1): {operator_number}")
print(f"Total Number of Operands (N2): {operand_number}")
print(f"Total Number of Tokens (N): {N}")
print()
print(f"1. Length of Program (N): (N1 + N2) = {N}")
print(f"2. Estimated Length = n * log n = {n * math.log(n , 2)}")
print(f"3. Volume (V): N * log N = {N * math.log(N , 2)}")

file.close()
