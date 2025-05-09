interface A{
	int add(int a,int b);
}
interface B extends A{
	int add(int a,int b,int c);
}
class C implements B{
	@Override
	public int add(int a,int b){
		return a+b;
	}
	@Override
	public int add(int a,int b,int c){
		return a+b+c;
	}
}
class InterOver{
	public static void main(String[] args){
		C c=new C();
		System.out.println(c.add(1,2));
		System.out.println(c.add(1,2,3));
	}
}

