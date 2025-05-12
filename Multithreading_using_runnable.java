class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("In A");
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("In B");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Multithreading_using_runnable {
    public static void main(String[] args) {
        A a=new A();
        Thread t1=new Thread(a);
        t1.start();
        B b=new B();
        Thread t2=new Thread(b);
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }
}