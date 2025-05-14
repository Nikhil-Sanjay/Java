import java.io.*;
class DemoReader{
	public static void main(String[] args) throws Exception
	{
		Reader r=new FileReader("sample1.txt");
		System.out.println(r.ready());
		char[] arr=new char[100];
		r.read(arr); //it will read and store it in the array
		System.out.println(arr);
		r.close();
	}
}