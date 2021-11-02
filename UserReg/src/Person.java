public class Person {

	
	public Person(String umail, String pwd, int age, String add) {
		super();
		Umail = umail;
		this.pwd = pwd;
		Age = age;
		this.add = add;
	}
	private String Umail;
	private String pwd;
	private int Age;
	private String add;
	

public static void main(String[] args) //throws Exception
{
	
	System.out.println("Begin main");
	try{  
	      //code that may raise exception  
	      int Age=16;  
	      
	   }catch(ArithmeticException e){System.out.println(e);}  
	   //rest code of the program   
	   System.out.println("age is less to regsiter...");  
	  }  
	}  