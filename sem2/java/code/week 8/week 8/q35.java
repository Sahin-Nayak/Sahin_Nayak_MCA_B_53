public class q35 {
    public static void main(String[] args) {
        String text = "This is a string with two occurrences of 'is'.";
        String oldStr = "is";
        String newStr = "was";
        int count = countReplaceFirst(text, oldStr, newStr);
        System.out.println("Original text: " + text);
        System.out.println("Replaced text: " + text); 
        System.out.println("Number of replacements: " + count);}
    public static int countReplaceFirst(String text, String oldStr, String newStr) {
        int count = text.length() - text.replace(oldStr, "").length();
        if (count > 0) {
            text = text.replaceFirst(oldStr, newStr);}
        return count;}}