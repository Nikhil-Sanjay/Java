class Thread1 extends Thread{
	Thread t1=new Thread(this);
	public void run(){
		try{
			t1.setName("Extended thread");
			for(int i=0;i<5;i++){
				Thread.sleep(1000);
				System.out.println(t1.getName());
			}
		}catch(Exception e){}
	}
	

}
class Demothread{
	public static void main(String[] args) throws Exception
	{
		Thread1 t=new Thread1();
		t.start();
		Thread t2=Thread.currentThread();
		t2.setName("Main Thread");
		for(int i=0;i<5;i++){
			Thread.sleep(500);
			System.out.println(t2.getName());

		}
	}
}
