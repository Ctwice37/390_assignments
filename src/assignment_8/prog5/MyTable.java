package assignment_8.prog5;

public class MyTable {
	private Entry[] entries;
	private int size;

	MyTable(){
		entries = new Entry[26];
		size = 0;
	}
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		String s = null;
		for(int i = 0; i < size; i++){
			if(entries[i].ch == c)
				s = entries[i].str;
		}
		return s;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char ch, String str) {
		entries[size++] = new Entry(str, ch);

	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Entry e : entries) {
			if(e != null)
				sb.append(e + "\n");
		}

		return sb.toString();
	}
	
	
	private class Entry {
		char ch;
		String str;


		Entry(String str, char ch){
			this.ch = ch;
			this.str = str;
		}

		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			return ch + "->" + str;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();

		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('c',"Charlie");
		String s = t.get('b');
		System.out.println(s);

	}

}