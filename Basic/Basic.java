package Basic;
class Student{
	int age ;
	String name;
	Student abc;
	Student(int age , String name){
		this.age= age;
		this.name = name;
	}
	
}
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student a = new Student(20,"chetan");
       a.abc = a;
       
       System.out.println(a.abc);
       System.out.println(a);
       a.abc.age = 21;
       a.abc.name =  "verma";
       
       System.out.println(a.age + " "+a.name+"   "+a.abc.age+" "+a.abc.name);
//       Student b = a;
//       b.age = 21;
//       b.name = "verma";
//       System.out.println(a.age+ " " +a.name);
      
	}

}
