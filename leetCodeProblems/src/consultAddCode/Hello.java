package consultAddCode;

public class Hello extends Thread{
	public void run() {
		for(int i=0;i<100;i++)
		{
			System.out.println("I am reading"+i +": "+Thread.currentThread().getName());
		}
	}
}
