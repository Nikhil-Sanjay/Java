import java.util.*;
class Compo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name of the PG :");
        String pg_name=s.nextLine();
        System.out.println("Enter the PG ID :");
        String pg_id=s.nextLine();
        System.out.println("Enter the Name of the Customer : ");
        String c_name=s.nextLine();
        System.out.println("Enter the Phone number of the Customer ");
        String num=s.nextLine();
        System.out.println("Enter the Room number of the Customer : ");
        String room_no=s.nextLine();
        Customer c=new Customer(c_name,num,room_no);
        PG p=new PG(pg_name,pg_id,c);
        p.displayDetails();
    }
}
class Customer{
    String name;
    String phone_no;
    String room_no;
    Customer(String name,String phone_no,String room_no){
        this.name=name;
        this.phone_no=phone_no;
        this.room_no=room_no;
    }
}
class PG{
    String name;
    String id;
    Customer c;
    PG(String name,String id,Customer c){
        this.name=name;
        this.id=id;
        this.c=c;
    }
    public void displayDetails(){
    	System.out.println("Displaying the details");
        System.out.println("Name of the PG : "+name);
        System.out.println("PG ID : "+id);
        System.out.println("Name of the Customer : "+c.name);
        System.out.println("Phone number of the Customer : "+c.phone_no);
        System.out.println("Room number of the Customer : "+c.room_no);
    }
}
