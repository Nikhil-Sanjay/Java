import java.io.*;
public class DIOS {
    public static void main(
        String[] args) throws IOException
    {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("sample.txt"));
		String str="Hello java";
		byte[] arr=str.getBytes();
		dos.write(arr);
		dos.write(34);
		dos.write(35);
		dos.write(36);
		DataInputStream din=new DataInputStream(new FileInputStream("sample.txt"));
		int i;
		while((i=din.read())!=-1){
			System.out.println((char)i);
		}	
		din.close();
		dos.close();	
    }
}