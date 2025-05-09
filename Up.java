class A{
	int a=10;
	public void display(){
		System.out.println("A is printed");
		
	}
	public void display1(){
		System.out.println(a);
	}

}
class B extends A{
	int a=20;
	@Override
	public void display(){
		System.out.println("B is printed");
	}
	public void display1(){
		System.out.println(a);
	}
	
	
}
class Up{
	public static void main(String[] args){
		B b=new B();
		b.display();
		b.display1();
		A b1=new B();
		b1.display();
		b1.display1();
		A a=new A();
		a.display();
		a.display1();
	}
}
