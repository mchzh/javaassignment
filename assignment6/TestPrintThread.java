package Thread;

public class TestPrintThread {
	public static void main(String[] args) throws InterruptedException {
		PrintCharcter printchar = new PrintCharcter();
		char[] charob = {'A','B','C','D','E'};
		PrintThread[] PrintThreads = new PrintThread[charob.length];

		int count = 0;
		while( count < 10 ) {
			for(int i=0; i<charob.length; i++) {
				PrintThreads[i] = new PrintThread(printchar,charob[i]);
			}
			for(PrintThread t : PrintThreads) {
				t.start();
				t.join();
			}
			count++;
		}
	}
}

class PrintThread extends Thread {
	private PrintCharcter pc;
	private char operation;
	
	public PrintThread(PrintCharcter pc, char operation) {
		this.pc = pc;
		this.operation = operation;
	}
	
	public void run() {
		pc.setPrintname(operation);
		pc.printthischar();
	}
}
