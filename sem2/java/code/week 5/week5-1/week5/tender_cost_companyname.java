import java.util.Scanner;
class Tender {
    private double cost;
    private String companyName;
    public Tender(String companyName, double cost) {
        this.companyName = companyName;
        this.cost = cost;}
    public double getCost() {
        return cost;}
    public String getCompanyName() {
        return companyName; }}
public class tender_cost_companyname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] tenders = new Tender[5];
        for (int i = 0; i < tenders.length; i++) {
            System.out.println("Enter details for Tender " + (i + 1) + ":");
            System.out.print("Company Name: ");
            String companyName = sc.nextLine();
            System.out.print("Cost: ");
            double cost = sc.nextDouble();
            tenders[i] = new Tender(companyName, cost);
            sc.nextLine(); } // Consume newline character
        Tender minCostTender = tenders[0];
        for (int i = 1; i < tenders.length; i++) {
            if (tenders[i].getCost() < minCostTender.getCost()) {
                minCostTender = tenders[i];}}
        System.out.println("\nCompany with Minimum Cost:");
        System.out.println("Company Name: " + minCostTender.getCompanyName());
        System.out.println("Cost: " + minCostTender.getCost());
        sc.close();}}
