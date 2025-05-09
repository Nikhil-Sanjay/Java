interface Vehicle{
	void wheels();
	void gears();
}
interface Airways extends Vehicle{
	void fly();
}
class Helicopter implements Airways{
	@Override
	public void wheels(){
		System.out.println("Helicopter has Three wheels");
	}
	@Override
	public void gears(){
		System.out.println("Helicopter has 18 gears");
	}
	@Override
	public void fly(){
		System.out.println("Helicopter can fly");
	}
	
}
class Car implements Vehicle{
	@Override
	public void wheels(){
		System.out.println("Four wheeler");
	}
	@Override
	public void gears(){
		System.out.println("Car has five gears");
	}
}
class Bike implements Vehicle{
	@Override
	public void wheels(){
		System.out.println("Two wheeler");
	}
	@Override
	public void gears(){
		System.out.println("Bike has four gears");
	}
}

class Inter{
	public static void main(String[] args){
		Car c=new Car();
		c.wheels();
		c.gears();
		Bike b=new Bike();
		b.wheels();
		b.gears();
		Helicopter h=new Helicopter();
		h.wheels();
		h.gears();
		h.fly();
		
	}
}