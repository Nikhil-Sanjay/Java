class Runnable_with_lambdaexp {
    public static void main(String[] args) {
        Runnable a=()->{
            for(int i=0;i<10;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In A");
            }
            
        };
        Runnable b=()->{
            for(int i=0;i<20;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In B");
            }
            
        };
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }
}

class Multithreading_using_runnable {
    public static void main(String[] args) {
        Runnable a=()->{
            for(int i=0;i<10;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In A");
            }
            
        };
        Runnable b=()->{
            for(int i=0;i<20;i++){
                try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("In B");
            }
            
        };
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        try{Thread.sleep(1000);}catch(Exception e){}
        t2.start();
    }
}

