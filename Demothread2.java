class Demothread2{
	public static void main(String[] args) throws Exception
	{
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}
}
class Thread1 extends Thread{
	int j;
	public void run(){
		try{
			for(int i=0;i<100;i++){
			    j++;
			    System.out.println(j);
			}
		}catch(Exception e){}
	}
	

}
