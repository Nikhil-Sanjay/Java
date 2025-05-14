import java.io.StringReader;
class DemoStringReader{
	public static void main(String[] args) throws Exception{
		String str="I am a Alien";
		//String str="Hello Java!";
		char[] arr=new char[100];
		StringReader sr=new StringReader(str);
		int i;
		sr.skip(2);
		while((i=sr.read())!=-1){
			System.out.print((char)i);
		}
		/*sr.read(arr);
		System.out.println(arr);*/
		sr.close();
		
	}
}