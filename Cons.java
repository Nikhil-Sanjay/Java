class Parent{
     String name ="Nikhil";
    Parent(){
        System.out.println("1."+name);
    }
    Parent(String s){
        this.name=s;
        System.out.println("2."+s);
    }
    public void dis(){
        System.out.println("3."+name);
    }
}
class Cons {
    public static void main(String[] args) {
        Parent p1=new Parent();
        Parent p2=new Parent("Ajay");
        Parent p3=p2;
        p3.name="Sai";
        p3.dis();
        p2.dis();
    }
}
