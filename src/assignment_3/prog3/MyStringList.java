package assignment_3.prog3;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(strArray.length == size)
			resize();
		strArray[size++] = s;
		}


	
	public String get(int i){

		return strArray[i];
	}
	
	public boolean find(String s){
		for(int i = 0; i < size; i++) {
			if (strArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(strArray.length == size)
			resize();
		for(int i = pos+1; i < size; i++){
			strArray[i] = strArray[i-1];
		}
		strArray[pos] = s;
		
	}
	
	public boolean remove(String s){
		for(int i = 0; i < strArray.length; i++){
			if(strArray[i].equals(s)){
				strArray[i] = null;
				return true;
			}
		}
		return false;
	}
	
	
	private void resize(){
		String[] temp = strArray;
		strArray = Arrays.copyOf(temp, size*2 );
	}
	public String toString(){

		String s = "";
		for(int i = 0; i < size-1; i++){
			s += strArray[i];
		}

		return s;
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
		System.out.println(l.get(0));
	}

}
