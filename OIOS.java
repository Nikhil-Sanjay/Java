import java.io.*;
class Employee implements Serializable
{
	String name,city;
	transient String password;
	int id;
	Employee(String name,String city,int id,String password){
		this.name=name;
		this.city=city;
		this.id=id;
		this.password=password;
	}
	
}
class OIOS{
	public static void main(String[] args) throws Exception
	{
		Employee e1=new Employee("JP","Cbe",101);
		FileOutputStream f=new FileOutputStream("obj.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(e1);
		o.close();
		f.close();
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("obj.txt"));
		Employee e=(Employee)oi.readObject();
		System.out.println("Name : "+e.name+" "+"City : "+e.city+" "+"ID : "+e.id+" "+"Password : "+c.password);
	}
}