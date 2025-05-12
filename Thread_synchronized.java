class Thread_synchronized{
    public static void main(String[] args){
        Counter c=new Counter();
        Thread t1=new Thread(
            new Runnable(){
                public void run(){
                    for(int i=0;i<10;i++){
                        c.increment();
                    }
                }
            }
            );
        Thread t2=new Thread(
            new Runnable(){
                public void run(){
                    for(int i=0;i<10;i++){
                        c.increment();
                    }
                }
            }
            );
            t1.start();
            t2.start();
            try{t1.join();}catch(Exception e){}
            try{t2.join();}catch(Exception e){}
        
            System.out.println(c.display());
    }
}
class Counter{
    int num;
    public synchronized void increment(){
        num++;
    }
    public  int display(){
        return num;
    }
}