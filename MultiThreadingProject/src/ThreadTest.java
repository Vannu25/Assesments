
class MyThread extends Thread //1
{
	String msg;
	
	MyThread(String m) {
		msg = m;
	}
	
	//2 override
	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i+" "+ msg);
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		
		System.out.println("Begin");
		
		//3.
		MyThread mt1 = new MyThread("Ping"); //ping
		MyThread mt2 = new MyThread("\tPong"); //pong
		MyThread mt3 = new MyThread("\t\tPang"); //pang
		MyThread mt4 = new MyThread("\t\t\tPung"); //pung
		
				
		//4. 
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		
		System.out.println("End");
		
	}
}
/*
 
	What is a thread = set of instructions
	
	ac	acname	acbalance
	101	Jack	70000
	102 Jane	60000
	103	Jill	70000
	..
	..
	..
	
	
	
				Deposit Counter
				
		Teller1			Teller2			Teller3
		|				|				|
		getBalance()	getBalance()	getBalance()
		|				|				|
		calcAmt()		calcAmt()		calcAmt()
		|				|				|
		setBalance()	setBalance()	setBalance()
		|				|				|
		Customer1		Customer2		Customer3
time	10:30am			10:30am			10:30am
cash	5000/-			7000/-			8000/-
a/c		101				101				101
deno	500Rs(10) 		100Rs(70)		50(160)
	
	
	
				Runnable Frame
				|run();| |
				|	   | |	
				|	   Car
			  Thread
			  	| run() { } <------------------------------+
			  	|											|
			  	| start() { } ----> JVM's Thread Scheduler--+
	---------------
		|1.
		MyThread
		run() { } //2
		
		3. instantiate MyThread
		4. invoke the start() --> run()
		
		
	





*/

interface Readable				// Runnable
{
	void read();				// run();
}
class Reader implements Readable //   Thread 
{
	public void read() { //overridden		run() { }
		
	}
}
class BookReader extends Reader		// MyThread
{
	public void read() { //overriding
		
	}
}














