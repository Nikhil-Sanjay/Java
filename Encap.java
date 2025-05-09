class Customer{
	private String name;
	private String mob_no;
	private String acc_no;
	public void setName(String name){
		this.name=name;
	}
	public void setMob_no(String mob_no){
		this.mob_no=mob_no;
	}
	public void setAcc_no(String acc_no){
		this.acc_no=acc_no;
	}
	public String getName(){
		return name;
	}
	public String getMob_no(){
		return mob_no;
	}
	public String getAcc_no(){
		return acc_no;
	}
	
}
class Encap{
	public static void main(String[] args){
		Customer c=new Customer();
		c.setName("JP");
		c.setMob_no("9994963065");
		c.setAcc_no("80383784342");
		System.out.println(c.getName());
		System.out.println(c.getMob_no());
		System.out.println(c.getAcc_no());
	}
}
