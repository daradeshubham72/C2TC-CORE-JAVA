package com.cg.Threads;

public class ThreadsDemo {

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
class MyThread extends Thread
{//thread 2
	public void run()// make it run
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("I am My Thread");
			
		}
}
}