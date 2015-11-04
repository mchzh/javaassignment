
public class HashEntry {
//	public static void main(String[] args){
//		System.out.println("Hello World!");
//	}
	private int key;
	private int value;
	HashEntry next = null;
	
	public HashEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HashEntry(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
