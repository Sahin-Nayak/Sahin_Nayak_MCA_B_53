file = open(
    "Sem3\\Software Engineering\\Assignment 3\\q1_McCafe.py",
    "r",
)


a = file.readlines()
edges, nodes, decision, region = 0, 0, 0, 0
for i in a:
    if i[0:4] != "end ":
        nodes += 1
        edges += 1
    if i[0:6] == "while " or i[0:4] == "for " or i[0:3] == "if ":
        edges += 1
        decision += 1
        region += 1

edges -= 1
print(f"Volume = (Edges - Nodes + 2) = {edges - nodes + 2}")
print(f"Volume = (Decision Nodes + 1) = {decision + 1}")
print(f"Volume = (Closed Region + 1) = {region + 1}")
