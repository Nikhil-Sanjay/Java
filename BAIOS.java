import java.io.*;
class BAIOS{
	public static void main(String[] args){
		try{
			FileOutputStream fos1=new FileOutputStream("sample1.txt");
			FileOutputStream fos2=new FileOutputStream("sample2.txt");
			ByteArrayOutputStream bo=new ByteArrayOutputStream();
			String str="I am a Alien";
			int i;
			byte[] arr=str.getBytes();
			bo.write(arr);
			bo.writeTo(fos1);
			bo.writeTo(fos2);
			bo.flush();
			bo.close();
			fos1.close();
			fos2.close();
			ByteArrayInputStream bi1=new ByteArrayInputStream(arr);
			ByteArrayInputStream bi2=new ByteArrayInputStream(arr);
			while((i=bi1.read())!=-1){
				System.out.print((char)i);
			}
			System.out.println();
			while((i=bi2.read())!=-1){
				System.out.print((char)i);
			}
			bi1.close();
			bi2.close();
		}catch(Exception e){}
	}
}