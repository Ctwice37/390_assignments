package assignment_9.prog1;

public class MyStack {

    private MyStringLinkedList list;

    public MyStack() {
        list = new MyStringLinkedList();
    }

    public String pop() {
        String s ;
        if(list.size() == 0 || list.size() == 1) {
            s = list.header.next.value;
            list.header.next = null;
            return s;

        }else{
            s = list.header.next.value;
            list.header.next.next.previous = list.header;
            list.header.next = list.header.next.next;
        }return s;

    }

    public String peek() {
        //implement
        return list.header.next.value;
    }

    public void push(String s) {
        list.add(s);

    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push("Bob");
        stack.push("Harry");
        stack.push("Alice");
        System.out.println("Popping…" + stack.pop());
        //System.out.println("Peeking…." + stack.peek());
        System.out.println("Popping…" + stack.pop());
        System.out.println("Popping…" + stack.pop());


    }
}
