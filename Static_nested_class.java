class Static_nested_class{
    public static void main(String[] args){
        Cricketer c=new Cricketer("Kohli",42);
        Cricketer.Kohli k=  new Cricketer.Kohli(10,16);
        c.name="MSD";
        k.display();
    }
}
public class Cricketer{
     static String name;
     int age;
     Cricketer(String name,int age){
         this.name=name;
         this.age=age;
     }
    static class Kohli{
        private int no_of_cups;
        public int experience;
        Kohli(int no_of_cups,int experience){
            this.no_of_cups=no_of_cups;
            this.experience=experience;
        }
     
        public void display(){
            System.out.println(name+ " "+no_of_cups+" "+experience);
        }
        
    }
}