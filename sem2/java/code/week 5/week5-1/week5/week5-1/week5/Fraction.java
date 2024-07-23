package week5;

public class Fraction {
    private int numerator;
    private int denominator;

    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        
        this.denominator = (denominator != 0) ? denominator : 1;
    }

    
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }


    public void displayFraction() {
        System.out.println("Fractional Value: " + numerator + "/" + denominator+'='+numerator/denominator);
    }

    public static void main(String[] args) {
       
        Fraction fraction1 = new Fraction(3, 4);   
        Fraction fraction2 = new Fraction(5);     
        Fraction fraction3 = new Fraction();       

      
        fraction1.displayFraction();
        fraction2.displayFraction();
        fraction3.displayFraction();
    }
}

