import java.io.*;
public class DemoPipedReader {
    public static void main(String[] args) throws IOException {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader(writer);
        Thread producer = new Thread(() -> {
            try {
                writer.write("I am a Alien");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                int i;
                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
