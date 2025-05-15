class User{
	String email="xyz@gmail.com";
	String password="password@123";
	User(String name,String password){
		this.email=email;
		this.password=password;
	}
	User(){}
	synchronized public void passCheck(String email,String password){
		try{
			wait();
		}catch(Exception e){}
		System.out.println("User is authorized");
	}

	synchronized public void auth(String email,String password){
		if(email==this.email && password==this.password){notify();}
		
		}		

}
class InterThreadCom{
	public static void main(String[] args) throws Exception{
		User u=new User();
		new Thread(){
			public void run(){
				u.passCheck("xyz@gmail.com","password@123");
			}
		}.start();
		new Thread(){
			public void run(){
				u.auth("xyz@gmail.com","password@123");
			}
		}.start();
	}
}
