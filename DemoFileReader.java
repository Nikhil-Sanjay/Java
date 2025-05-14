import java.io.*;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileReader;
class DemoFileReader{
	public static void main(String[] args) throws Exception
	{
		FileReader r=new FileReader("sample1.txt");
		System.out.println(r.ready());
		int i=0;
		while((i=r.read())!=-1){
			System.out.print((char)i);
		}
		r.close();
	}
}