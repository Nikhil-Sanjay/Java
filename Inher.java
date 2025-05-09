class Inher{
    public static void main(String args[])
    {
        Record c = new Record();
    }
    
}
class Person
{
    int age;
    public Person()
    {
        System.out.println("Person class no-args constructor called");
    }
    public Person(String name)
    {
        this();
        System.out.println("Person class parameterized constructor called by "+name);
    }
    Person(int age){
        System.out.println(age);
    }
    void display(){
        System.out.println("Display function called");
    }
    void display1(){
        this.display2();
        System.out.println("1.Display function called");
    }
    void display2(){
        System.out.println("2.Display function called");
    }
}
 class Record extends Person
{
    public Record()
    {
        this("Record class");
        System.out.println("Record class no-args constructor called");
    }
    public Record(String name)
    {
        // super();
        super(name);
        super.display();
        super.display1();
        super.display2();
        System.out.println("Record class parameterized constructor called by "+name);
    }
}
