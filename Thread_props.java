class Thread_props {
    public static void main(String[] args) {
        // To name thread directly:
        // Thread t1=new Thread(()->{
        //     for(int i=0;i<5;i++){
        //         try{Thread.sleep(1000);}catch(Exception e){}
        //         System.out.println("In A");
                
        //     }
        //     },"A Thread");
    
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In A");
                
            }
            });
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In B");}
            });
        t1.setName("A Thread");
        System.out.println(t1.getName());
        // t1.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        System.out.println(t1.isAlive());
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.setName("B Thread");
        System.out.println(t2.getName());
        t2.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(10);
        System.out.println(t2.getPriority());
        t2.start();
        try{t1.join();}catch(Exception e){}
        try{t2.join();}catch(Exception e){}
        // join(); is used to print below Sentence after execution of above threads
        System.out.println(t1.isAlive());
        System.out.println("Waited till t1 and t2 executes due to join()");
    }
}

