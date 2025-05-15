public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("Append: " + sb);
        sb.insert(5, ",");
        System.out.println("Insert: " + sb);
        sb.replace(6, 11, "Java");
        System.out.println("Replace: " + sb);
        sb.delete(5, 10);
        System.out.println("Delete: " + sb);
        sb.reverse();
        System.out.println("Reverse: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println( sb.toString());
    }
}

