import java.util.*;
class Composition1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        ArrayList<PG> al=new ArrayList<>();
        for(int i=0;i<n;i++){
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
        al.add(new PG(pg_name,pg_id,c));
        }
            for(int i=0;i<al.size();i++){
            System.out.println("Name of the PG : "+al.get(i).name);
            System.out.println("ID of the PG : "+al.get(i).id);
            Customer c=al.get(i).c;
            System.out.println("Name of the Customer : "+c.name);
            System.out.println("Phone number of the Customer : "+c.phone_no);
            System.out.println("Room number of thee customer : "+c.room_no);
        }
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
        System.out.println("Name of the PG : "+name);
        System.out.println("PG ID : "+id);
        System.out.println("Name of the Customer : "+c.name);
        System.out.println("Phone number of the Customer : "+c.phone_no);
        System.out.println("Room number of the Customer : "+c.room_no);
    }
}