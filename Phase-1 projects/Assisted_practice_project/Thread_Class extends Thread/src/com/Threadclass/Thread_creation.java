package com.Threadclass;

public class Thread_creation extends Thread {

		public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		Thread_creation mt= new Thread_creation();
	  		mt.start();
		}
}