public class Str {
    public static void main(String[] args) {
        String str1 = "Aryan Krishna";
        String str2 = "A cat is playing in the garden";
        System.out.println("Length of str1: " + str1.length() + "\nLength of str2: " + str2.length());
        System.out.println("Char at index 4\n1. " + str1.charAt(4) + "\n2. " + str2.charAt(4));
        System.out.println("Substring from 2 to 5\n1. " + str1.substring(2, 5) + "\n2. " + str2.substring(2, 5));
        System.out.println("Index of 'De': " + str1.indexOf("De") + "\nIndex of 'playing': " +  str2.indexOf("playing"));
        System.out.println("Uppercase\n1. " + str1.toUpperCase() + "\n2. " + str2.toUpperCase());
        StringBuffer str3 = new StringBuffer(str1);
        StringBuffer str4 = new StringBuffer(str2);
        str3.append(" is a CSE Student");
        System.out.println("Appended str1: " + str3.toString());
        str4.append(" with other cats");
        System.out.println("Appended str2: " + str4.toString());
        str3.insert(5, "java");
        str4.insert(5, "fish");
        System.out.println("Insert into index 5\n1. " + str3.toString() + "\n2. " + str4.toString());
        System.out.println("Reverse\n1. " + str3.reverse() + "\n2. " + str4.reverse());
    }
}