import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    
    public Account() {
        this(0, 0);
    }

  
    public Account(int id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
        this.annualInterestRate = 0; 
        this.dateCreated = new Date();
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100; 
    }

    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not sufficient money for account ID->"+this.id);
        }
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public static void main(String[] args) {
      
        Account account1 = new Account();
        System.out.println("Account 1 - ID: " + account1.getId() + ", Balance: $" + account1.getBalance());

      
        Account account2 = new Account(12345, 1000.0);
        System.out.println("Account 2 - ID: " + account2.getId() + ", Balance: $" + account2.getBalance());

     
        account1.setAnnualInterestRate(3.5); 
        account2.setAnnualInterestRate(4.2); 

        
        account1.withdraw(200);
        account2.deposit(500);

        
        System.out.println("Account 1 - Balance: $" + account1.getBalance() +
                ", Monthly Interest: $" + account1.getMonthlyInterest() +
                ", Date Created: " + account1.getDateCreated());
        
        System.out.println("Account 2 - Balance: $" + account2.getBalance() +
                ", Monthly Interest: $" + account2.getMonthlyInterest() +
                ", Date Created: " + account2.getDateCreated());
    }
}
