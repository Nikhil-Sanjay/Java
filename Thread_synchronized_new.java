class Thread_synchronized_new{
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
            ,"A");
        Thread t2=new Thread(
            new Runnable(){
                public void run(){
                    for(int i=0;i<10;i++){
                        // c.decrement();
                        c.increment();
                    }
                }
            }
            ,"B");
            t1.start();
            // try{t1.join();}catch(Exception e){}
            t2.start();
            // try{t2.join();}catch(Exception e){}
        
            // System.out.println(c.display());
    }
}
class Counter{
    int num;
    public  synchronized void increment(){
        num++;
        System.out.println(num+"Inc");
        num--;
    }
    // public synchronized void increment(){
    //     System.out.println(num+"Inc");
    //     num++;
    // }
    // public  void decrement(){
    //     System.out.println(num+"Dec");
    //     num--;
    // }
    // public synchronized void decrement(){
    //     System.out.println(num+"Dec");
    // }
    public  int display(){
        return num;
    }
}
