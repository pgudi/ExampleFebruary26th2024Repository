package com.sgtesting.thread;
class MyClass1 implements Runnable
{

	@Override
	
	
	public void run() {
		showEvenNumbers();	
	}
	
	synchronized void showEvenNumbers()
	{
		try
		{
			for(int i=10;i<=40;i++)
			{
				Thread.sleep(1000);
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+" displays Even Number :"+i);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		MyClass1 job=new MyClass1();
		
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		
		t1.setName("alpha");
		t2.setName("omega");
		
		t1.start();
		t2.start();

	}

}
