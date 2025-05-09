import myjavapack.Movie;
public class Language extends Movie{
	public String name,genre,lang;
	int collection,year;
	Language(String name,String genre,String lang,int year,int collection){
		super(name,year,collection);
		this.genre=genre;
		this.lang=lang;
	}
	void displayDetails(){
		
		System.out.println("Movie genre : "+genre);
		System.out.println("Movie Language : "+lang);
		
	}
	public static void main(String[] args){
		Language l=new Language("Singam","Action","Tamil",2010,1000);
		l.displayDetails();
	}
}
