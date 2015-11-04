
public class HashMapWithArray {
	public static void main(String[] args){
		HashMapWithArray has = new HashMapWithArray();
		has.put(10, 21);
		int value = has.get(10);
		System.out.println("Hello World!");
		System.out.println("get hashmap value is -> " + value);
	}
	private final static int TABLE_SIZE = 128;
	HashEntry[] table;
	
	public HashMapWithArray() {
		super();
		table = new HashEntry[TABLE_SIZE];
		for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = null;
        }
	}

	public HashMapWithArray(HashEntry[] table) {
		super();
		this.table = table;
	}
	public int get(int key){
		int hash = (key % TABLE_SIZE);
		while(table[hash] != null && table[hash].getKey() != key){
			hash = ((hash+1) % TABLE_SIZE);
		}
		if(table[hash] == null){
			return -1;
		}else{
			return table[hash].getValue();
		}
		
	}
	
	public void put(int key, int value){
		int hash = (key % TABLE_SIZE);
		while(table[hash] != null && table[hash].getKey() != key){
			hash = ((hash+1) % TABLE_SIZE);
		}
		table[hash] = new HashEntry(key, value);
	}
}
