package consultAddCode;

public class ThreadDemo {
	public static void main(String[] args)
	{
		//System.out.println("main method start");
		hi obj = new hi();
		obj.start();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Hello obj2 = new Hello();
				obj2.start();
				
			}
		});
		t1.start();
		
		
		//System.out.println("end the main");
	}

}
