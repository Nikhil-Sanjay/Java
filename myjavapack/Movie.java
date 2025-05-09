package myjavapack;
public class Movie{
	public String name;
	public int year;
	public int collection;
	public Movie(String name,int year,int collection){
		this.name=name;
		this.year=year;
		this.collection=collection;
		displayMovie();
	}
	/*public String name;
	public int year;
	public int collection;
	public Movie(String name,int year,int collection){
		this.name=name;
		this.year=year;
		this.collection=collection;
		displayMovie();
	}*/
	public void displayMovie(){
		System.out.println("Movie name : "+name);
		System.out.println("Movie release year : "+year);		
		System.out.println("Movie collection : "+collection);
	}
}
