package com.cg.Threads;

public class ThreadTryCatch {

	public static void main(String[] args) throws InterruptedException{
		
    MyThread obj=new MyThread();
    obj.start();//-------starting the thread
    
    obj.join();
    //thread 1
    for (int i=0;i<10;i++)
    {
    	System.out.println("I am Main Thread");
    }
	}
}
class MyThread1 extends Thread
{//thread 2
	public void run()// make it run
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("I am My Thread");		
		}

try {
	Thread.sleep(5000,200);
} catch (InterruptedException e) {
	//TODO Auto-generated catch block
	e.printStackTrace();
}

}

}
