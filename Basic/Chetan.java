package Basic;
import java.util.Scanner;

class person{
	
	private String name;
	private int age;
	
	person() {
		this.name = "no name given";
		this.age = 0;
	}
	
	public void getage() {
		System.out.println(this.age);
	}
	
	 public void getname() {
		System.out.println(this.name);
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name: "+this.name+" ,age: "+this.age);
	}
	
}


class singer extends person{
	private String hobby;
	
	public void sethobby(String abc) {
		this.hobby  = abc;
	}
	public void display() {
		System.out.println(this.hobby+ " ccc");
	}
}

public class Chetan {

	public static void main(String[] args) {
		
		person p1 = new person();
		p1.setname("Chetan");
		p1.setage(20);
		p1.display();
		
        singer s1 = new singer();
        s1.setname("vermaaa");
        s1.sethobby("singing");
        s1.display();
}
}
