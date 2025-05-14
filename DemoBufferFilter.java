import java.io.*;

public class DemoBufferFilter{
    public static void main(String[] args) throws Exception{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"));
		bos.write("Hello Java".getBytes());
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("sample1.txt"));
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

    }
}
