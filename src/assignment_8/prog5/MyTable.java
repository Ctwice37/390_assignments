public class MyTable {
	private Entry[] entries;
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		//implement
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		//implement
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		//implement
		return null;
	}
	
	
	private class Entry {
		Entry(String str, char ch){
			//implement
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			//implement
			return null;
		}
	}

}