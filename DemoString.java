public class DemoString {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        System.out.println(str.equals(str1));
        str1="hello";
        System.out.println(str.equalsIgnoreCase(str1));
        str1="   hello";
        System.out.println(str.trim());
        System.out.println("Length: " + str.length());
        System.out.println("Char at 4: " + str.charAt(4));
        System.out.println("Substring: " + str.substring(1, 4));
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());
        String newStr = str.concat(" World");
        System.out.println("Concatenated: " + newStr);
        System.out.println("Replace: " + str.replace("e", "a"));
    }
}

