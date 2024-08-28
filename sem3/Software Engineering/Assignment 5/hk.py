def calculate_hk_metric(in_flows, out_flows):
    hk_values = []
    for i in range(len(in_flows)):
        hk = (in_flows[i] * out_flows[i]) ** 2
        hk_values.append(hk)
    return hk_values

def main():
    num_modules = int(input("Enter the number of modules: "))
    
    in_flows = []
    out_flows = []
    
    for i in range(num_modules):
        in_flow = int(input(f"Enter the in-flow for module {i+1}: "))
        out_flow = int(input(f"Enter the out-flow for module {i+1}: "))
        in_flows.append(in_flow)
        out_flows.append(out_flow)
    
    hk_values = calculate_hk_metric(in_flows, out_flows)
    
    print("\nHK Information Flow Metrics:")
    for i in range(num_modules):
        print(f"Module {i+1}: HK = {hk_values[i]}")
    
if __name__ == "__main__":
    main()
