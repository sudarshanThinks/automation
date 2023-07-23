package javaDemo;

public class ThreadByRunnable implements Runnable {

	@Override
	
	
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i have created by the runnable interface");
	}


public static void main(String[]args){
	ThreadByRunnable tr=new ThreadByRunnable();
	Thread tz=new Thread(tr);
	tz.start();
}
}