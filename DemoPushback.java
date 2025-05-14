import java.io.*;

public class DemoPushback {
    public static void main(String[] args) {
        String input = "HAI I am Java";
        try (PushbackInputStream pis = new PushbackInputStream(new ByteArrayInputStream(input.getBytes()))) {
            int ch = pis.read();
            System.out.println("Read: " + (char) ch);

            if (ch == 'A') {
                pis.unread(ch);
                ch = pis.read(); 
                System.out.println("Re-read: " + (char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
