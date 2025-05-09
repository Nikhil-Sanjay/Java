import java.util.ArrayList;
class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}
class Department {
    public String name;
    public ArrayList<Professor> professors;
    Department(String name, ArrayList<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }
    void printProfessors() {
        System.out.println(name + " Department has:");
        for (Professor p : professors) {
            System.out.println("- " + p.name);
        }
    }
}
class Asso{
	public static void main(String[] args){
		Professor p1=new Professor("Arun");
		Professor p2=new Professor("Mohan");
		ArrayList<Professor> al=new ArrayList<Professor>();
		al.add(p1);
		al.add(p2);
		Department d=new Department("CSE",al);
		d.printProfessors();
	}
}
