class Nested_class{
    public static void main(String[] args){
        Cricketer c=new Cricketer("Kohli",42);
        // Cricketer c=new Cricketer();
        Cricketer.Kohli k= c.new Kohli(10,16);
        // Cricketer.Kohli k= c.new Kohli("Kohli",42,0,16);
        c.name="MSD";
        k.display();
    }
}
public class Cricketer{
     String name;
     int age;
     Cricketer(String name,int age){
         this.name=name;
         this.age=age;
     }
    class Kohli{
        private int no_of_cups;
        public int experience;
        Kohli(int no_of_cups,int experience){
        // Kohli(String name,int age,int no_of_cups,int experience){
            // Cricketer.name=name;
            // Cricketer.age=age;
            this.no_of_cups=no_of_cups;
            this.experience=experience;
        }
     
        public void display(){
            System.out.println(name+" " +age+" "+no_of_cups+" "+experience);
        }
        
    }
}