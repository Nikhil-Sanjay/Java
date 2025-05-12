class Runnable_with_lambdaexp_without_obj {
    public static void main(String[] args) {
        // Runnable a=
            
        // };
        // Runnable b=
            
        // };
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In A");}
            });
        Thread t2=new Thread(()->{
            for(int i=0;i<20;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In B");}
            });
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }
}

