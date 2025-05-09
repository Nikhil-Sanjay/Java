abstract class A{
	void display1(){
		System.out.println("Displaying normal methods in abstract methods");
	}
	abstract void display2();
	
}
class B extends A{
	@Override
	void display2(){
		System.out.println("Class overrides abstract method");
	}
	
}
class Abs{
	public static void main(String[] args){
		B b=new B();
		b.display1();
		b.display2();
	}
}