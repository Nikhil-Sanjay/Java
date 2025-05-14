import java.io.*;
class FileCreation
{
	public static void main(String[] args) throws Exception
	{
		File f=new File(args[0]);
		f.createNewFile();
		boolean stat=f.createNewFile();
		if(stat){
			System.out.println("New file is created");
		}else{
			System.out.println("File already exists");
			System.out.println(f.getName());
			System.out.println(" "+f.isAbsolute());
			System.out.println("Path /t:"+f.getAbsolutePath());
			System.out.println("Can Read: "+f.canRead());
			System.out.println("Can Write: "+f.canWrite());
		}
	}
}