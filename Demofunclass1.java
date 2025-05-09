interface demofun1{
     void pow(double a,double b);
}
public class Demofunclass1
{
	public static void main(String[] args) {
	    new demofun1(){
	        @Override
	        public void pow(double a,double b){
	            System.out.println(Math.pow(a,b));
	        }
	   }.pow(2,8);
	    
	  
	}
}