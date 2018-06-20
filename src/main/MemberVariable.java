package main;

public class MemberVariable { 
	   
	 Member m = new Member(); 
	 
	 public String func ( String str, int n, double d)
	 {
		 m.name = str;
		 m.age = n;
		 m.salary = d;
		  
		 return m.name;
	 }
	 
	 public int func1 ( String str, int n, double d)
	 {
		 m.name = str;
		 m.age = n;
		 m.salary = d;
		  
		 return m.age;
	 }
	 
	 public double func2( String str, int n, double d)
	 {
		 m.name = str;
		 m.age = n;
		 m.salary = d;
		  
		 return m.salary;
	 }
	
}
class Member{

	public String name;
	public int age;
	public double salary;

}	


