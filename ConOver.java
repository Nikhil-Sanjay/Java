class Parent{
    public static String name ="Harris";
    //  String name;
     int age;
     Parent(){
         System.out.println("Parent is also called");
         System.out.println(name+" "+age);
     }
 }
 class Child extends Parent{
     private String s;
     private int age;
     private String city;
     String college="SKCET";
    Child(){
        System.out.println("Child is callled");
    }
    Child(int a,float b){
        System.out.println(a+" * "+b+" = ");
    }
    @Override
    public String toString(){
        return this.s+" "+this.age+" "+this.city+" "+this.college;
    }
    Child(String s,int age,String city){
        System.out.println("1. "+s+" "+age+" "+city);
        this.s="Ash";
        this.age=54;
        this.city="Cbe";
        System.out.println("2. "+s+" "+age+" "+city);
        System.out.println("3. "+this.s+" "+this.age+" "+this.city);
        // this.s=s;
        // this.age=age;
        // this.city=city;
        System.out.println("4. "+this.toString());
   
    }
    public String disp(String s,int age,String city){
        // return "new "+"43 "+"coimbatore";
        return s+" "+age+" "+city;
    }
    public String disp(){
        // return "new "+"43 "+"coimbatore";
        return s+" "+age+" "+city;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public float mul(int a,float b){
        return a*b;
    }
}
public class ConOver {
    public static void main(String[] args) {
        Child obj=new Child(9,10.5f);
        Child obj2=new Child("Ajay",34,"Trichy");
        System.out.println(obj.mul(9,10.5f));
        System.out.println(obj2.disp("Ajay",34,"Trichy"));
        System.out.println(obj2.disp());
    }
}
