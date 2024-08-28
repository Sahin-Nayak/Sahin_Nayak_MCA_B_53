
def calculate_te(to, tm, tp):
    return (to + 4 * tm + tp) / 6


num_activities = int(input("Enter the number of activities: "))

activities = []


for i in range(num_activities):
    print(f"\nEnter details for activity {i+1}:")
    activity = input("Activity (e.g., 1-2): ")
    to = float(input("Enter optimistic time (To): "))
    tm = float(input("Enter most likely time (Tm): "))
    tp = float(input("Enter pessimistic time (Tp): "))
    

    te = calculate_te(to, tm, tp)
    

    activities.append({"activity": activity, "to": to, "tm": tm, "tp": tp, "te": te})


print("\nActivity | To | Tm | Tp | Te")
for act in activities:
    print(f"{act['activity']}    | {act['to']}  | {act['tm']}  | {act['tp']}  | {act['te']:.3f}")


num_paths = int(input("\nEnter the number of paths: "))

paths = []


for i in range(num_paths):
    print(f"\nEnter details for path {i+1}:")
    path_name = input("Path name (e.g., 1-2-4-5): ")
    activities_in_path = input("Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): ").split(", ")
    

    total_te = sum(act["te"] for act in activities if act["activity"] in activities_in_path)
    

    paths.append({"path": path_name, "activities": activities_in_path, "total_te": total_te})


critical_path = max(paths, key=lambda x: x["total_te"])


print("\nPaths and their total estimated time (Te):")
for path in paths:
    print(f"Path {path['path']}: Total Te = {path['total_te']:.3f}")


print(f"\nCritical Path: {critical_path['path']} with Total Te = {critical_path['total_te']:.3f}")





# output

# Enter the number of activities: 8

# Enter details for activity 1:
# Activity (e.g., 1-2): 1-2
# Enter optimistic time (To): 1
# Enter most likely time (Tm): 2
# Enter pessimistic time (Tp): 3

# Enter details for activity 2:
# Activity (e.g., 1-2): 1-3
# Enter optimistic time (To): 3
# Enter most likely time (Tm): 4
# Enter pessimistic time (Tp): 5

# Enter details for activity 3:
# Activity (e.g., 1-2): 1-4
# Enter optimistic time (To): 1
# Enter most likely time (Tm): 2
# Enter pessimistic time (Tp): 4

# Enter details for activity 4:
# Activity (e.g., 1-2): 1-5
# Enter optimistic time (To): 2
# Enter most likely time (Tm): 4
# Enter pessimistic time (Tp): 5

# Enter details for activity 5:
# Activity (e.g., 1-2): 2-4
# Enter optimistic time (To): 6
# Enter most likely time (Tm): 7
# Enter pessimistic time (Tp): 8

# Enter details for activity 6:
# Activity (e.g., 1-2): 2-5
# Enter optimistic time (To): 10
# Enter most likely time (Tm): 12
# Enter pessimistic time (Tp): 15

# Enter details for activity 7:
# Activity (e.g., 1-2): 3-5
# Enter optimistic time (To): 1
# Enter most likely time (Tm): 2
# Enter pessimistic time (Tp): 4

# Enter details for activity 8:
# Activity (e.g., 1-2): 4-5
# Enter optimistic time (To): 2
# Enter most likely time (Tm): 3
# Enter pessimistic time (Tp): 5

# Activity | To | Tm | Tp | Te
# 1-2    | 1.0  | 2.0  | 3.0  | 2.000
# 1-3    | 3.0  | 4.0  | 5.0  | 4.000
# 1-4    | 1.0  | 2.0  | 4.0  | 2.167
# 1-5    | 2.0  | 4.0  | 5.0  | 3.833
# 2-4    | 6.0  | 7.0  | 8.0  | 7.000
# 2-5    | 10.0  | 12.0  | 15.0  | 12.167
# 3-5    | 1.0  | 2.0  | 4.0  | 2.167
# 4-5    | 2.0  | 3.0  | 5.0  | 3.167

# Enter the number of paths: 6

# Enter details for path 1:
# Path name (e.g., 1-2-4-5): 1-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 1-5

# Enter details for path 2:
# Path name (e.g., 1-2-4-5): 1-2-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 1-2, 2-5

# Enter details for path 3:
# Path name (e.g., 1-2-4-5): 1-3-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 1-3, 3-5

# Enter details for path 4:
# Path name (e.g., 1-2-4-5): 1-4-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 1-4, 4-5

# Enter details for path 5:
# Path name (e.g., 1-2-4-5): 2-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 2-5

# Enter details for path 6:
# Path name (e.g., 1-2-4-5): 2-4-5
# Enter the activities in this path separated by commas (e.g., 1-2, 2-4, 4-5): 2-4, 4-5

# Paths and their total estimated time (Te):
# Path 1-5: Total Te = 3.833
# Path 1-2-5: Total Te = 14.167
# Path 1-3-5: Total Te = 6.167
# Path 1-4-5: Total Te = 5.333
# Path 2-5: Total Te = 12.167
# Path 2-4-5: Total Te = 10.167

# Critical Path: 1-2-5 with Total Te = 14.167