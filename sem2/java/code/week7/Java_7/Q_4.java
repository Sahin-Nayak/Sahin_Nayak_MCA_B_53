public class Q_4 {
    private int totalAlphabeticCharacters;
    public Q_4() {
        this.totalAlphabeticCharacters = 0;}
    public void addCharacter(char c) throws IllegalArgumentException {
        if (!Character.isLetter(c)) {
            throw new IllegalArgumentException("Non-alphabetic character passed: " + c);}
        totalAlphabeticCharacters++;}
    public int getTotalAlphabeticCharacters() {
        return totalAlphabeticCharacters;}
    public static void main(String[] args) {
        Q_4 counter = new Q_4();
        try {
            counter.addCharacter('a');
            counter.addCharacter('b');
            counter.addCharacter('1'); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());}
        System.out.println("Total alphabetic characters: " + counter.getTotalAlphabeticCharacters());}}