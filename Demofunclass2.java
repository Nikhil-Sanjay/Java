interface demofun2{
    abstract void pow(double a,double b);
}
public class Demofunclass2
{
	public static void main(String[] args) {
	    demofun2 f=(x,y)->System.out.println(Math.pow(x,y));
	    f.pow(2,8);
	}
}