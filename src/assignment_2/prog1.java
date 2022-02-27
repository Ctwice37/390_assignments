package assignment_2;

public class prog1 {
 
    public void print(byte x){System.out.print("byte");}
    public void print(int x){System.out.print("int");}
    public void print(float x){System.out.print("float");}
    public void print(Object x){System.out.print("Object");}
    public static void main(String[] args){
        prog1 t = new prog1();
        short s = 123;
        //t.print(s);
        t.print(true);
        //t.print(6.789);
    }
}
