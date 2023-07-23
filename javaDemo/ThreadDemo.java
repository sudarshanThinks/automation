package javaDemo;

public class ThreadDemo extends Thread {
	public void run(){
		System.out.println("i am running now");//running
	
	for(int i = 0;i<3;i++) {
		System.out.println(i);
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadDemo td=new ThreadDemo();
		 td.start();//runable
		 System.out.println(td.getName());
		 System.out.println(td.getPriority());
		 System.out.println(td.getId());
	}

}
