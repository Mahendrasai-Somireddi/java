package tasks;

class Animal{
	
	private String forestName;
	public int count;
	public String country;
	public Animal() {
		System.out.println("Animal constructer with no arguments");
	}
	public Animal(int count,String country) {
		this.count=count;
		this.country=country;
	}
	public String getForestName() {
		return forestName;
	}
	public void setForestName(String forestName) {
		this.forestName = forestName;
	}
	
	
	
}
class WildAnimal extends Animal{
	public WildAnimal() {
		
	}
	public WildAnimal(int count,String country) {
		super(count,country);
	}
	
}
class Tiger extends WildAnimal{
	public Tiger() {
		
	}
	public Tiger(int count,String country) {
		super(count,country);
	}
	public void showDetails() {
		System.out.println("Forest name : "+getForestName());
		System.out.println("Animal count : "+count);
		System.out.println("country name : "+country);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Tiger tiger=new Tiger(100,"India");
		tiger.setForestName("Nallamalla");
		tiger.showDetails();
	}

}
