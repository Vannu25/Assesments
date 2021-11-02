import com.java.container.MyFloat;
import com.java.container.MyInteger;
import com.java.container.MyString;
import com.java.container.MyValue;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger m1= new MyInteger(10,20);
		m1.print();
		m1.swap();
		m1.print();
		
		MyFloat f1= new MyFloat(10.5f,20.5f);
		m1.print();
		m1.swap();
		m1.print();
		
		MyString s1= new MyString("core","java");
		s1.print();
		s1.swap();
		s1.print();
		
		MyValue v1= new MyValue(50,20);
		v1.print();
		v1.swap();
		v1.print();
		
	}

}

