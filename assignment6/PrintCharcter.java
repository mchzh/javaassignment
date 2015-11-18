package Thread;

public class PrintCharcter {
	private static Object CHAR_LOCK = new Object();
	private static Object getCharLock() {
		return CHAR_LOCK;
	}
	private char printname;
	
	public char getPrintname() {
		return printname;
	}

	public void setPrintname(char printname) {
		this.printname = printname;
	}
	
//	public synchronized void printthischarA() {
//		System.out.print("A");
//	}
//	public synchronized void printthischarB() {
//		System.out.print("B");
//	}
//	public synchronized void printthischarC() {
//		System.out.print("C");
//	}
//	public synchronized void printthischarD() {
//		System.out.print("D");
//	}
//	public synchronized void printthischarE() {
//		System.out.print("E");
//	}
	public void printthischar() {
		synchronized (getCharLock()) {
			System.out.print(printname);
		}	
	}
	
//	@Override
//	public void run() {
//		synchronized(this) {
//			printthischar();
//		}
//	}
}
