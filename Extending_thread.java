class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("In A");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("In B");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
class Extending_thread {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        B b=new B();
        b.start();
    }
}