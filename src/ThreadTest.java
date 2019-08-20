
class Needle extends Thread{
	
	public static void printNumbers() {
	  synchronized(Needle.class) {
		for(int i = 0; i <= 9; i++) {
			System.out.println("Thread " + Thread.currentThread().getId() + ": " + i + "");
		}
	  }
	}

	
	public void run() {
		
		printNumbers();
		
	}
}


public class ThreadTest {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			
				new Needle().start();
				
		}

	}
}


