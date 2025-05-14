import java.io.*;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.FileReader;
class DemoBufferedReader{
	public static void main(String[] args) throws Exception
	{
		FileReader r=new FileReader("sample1.txt");
		BufferedReader br=new BufferedReader(r);
		int i=0;
		/*while((i=br.read())!=-1){
			System.out.print((char)i);
		}*/
		System.out.println("Mark is supported? : "+br.markSupported());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.mark(2);
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.reset();
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.close();
		r.close();
	}
}