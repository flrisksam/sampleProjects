package oops;

public class keywords 
{
	int rollno;
	String name;  
	float fee; 
	
	keywords(int rollno,String name,float fee)
	{ //used to assign value to constructor variable 
	this.rollno=rollno;  
	this.name=name;
	this.fee=fee;
	} 
	//if different variable name used them this keyword not required
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	void m()
	{
		System.out.println("hello m");
	}  
	keywords()
	{  
	System.out.println("hello keyword"); 
	}
	keywords(int x)
	{
	this();//help to call default constructor from parameterized constructor.
	System.out.println("hello keyword: "+x); 
	}
	
	void n()
	{  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}
	
	public static void main(String args[])
	{
		keywords s1=new keywords(111,"ankit",5000f);
		s1.display();
		s1.n();//invoke a method
		keywords s2=new keywords(111);
	}
}