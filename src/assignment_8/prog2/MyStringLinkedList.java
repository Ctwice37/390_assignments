package assignment_8.prog2;

public class MyStringLinkedList {
    Node header;

    MyStringLinkedList() {
        header = new Node(null);
    }

    //adds to the front of the list
    public void addFirst(String item) {
        Node n = new Node(item);
        //place new node after header and
        //establish links from new node to
        //surrounding nodes
        n.next = header.next;
        n.previous = header;

        //establish links from surrounding
        //nodes to the new node
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }

    //adds to the end of the list
    public void addLast(String item) {
        Node n = new Node(item);
        //find last node
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        //now last.next == null
        last.next = n;
        n.previous = last;
    }

    //removes node in last position
    public void removeLast() {
        //if list is empty, return
        if (header.next == null) return;

        Node current = header;
        //traverse the list until current.next is
        //null - then remove current
        while (current.next != null) {
            current = current.next;
        }
        //now current.next == null, so remove current
        Node previous = current.previous;
        //previous is not null since current is not header
        previous.next = null;
        current.previous = null;
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        Node next = header.next;
        while (next != null && !next.value.equals(s)) {
            next = next.next;
        }
        //either next == null or next.value is s
        if (next == null) return false;
        else {//next.value.equals(s)
            return true;
        }
    }

    public String toString() {
        var sb = new StringBuffer();
        Node next = header.next;
        while (next != null) {
            sb.append(next.toString() + ", ");
            next = next.next;
        }
        var result = sb.toString().trim();
        if (result.length() == 0) return "<empty list>";
        if (result.charAt(result.length() - 1) == ',') {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    //Unimplemented Methods******************************

    public void insert(String data, int pos) {
        Node current = header;
        Node n;
        int pointer = 0;

        while (pointer != pos && current != null) {
            current = current.next;
            pointer++;
        }
        if (pointer == pos) {
            n = new Node(data);
            n.next = current.next;
            n.previous = current;
            current.next = n;
        }

    }


    public boolean remove(String data) {
        Node current = header.next;
        if(search(data)){
            while(current != null){
                if(current.value.equals(data)){
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                current = current.next;
            }
        }return false;
    }


    public void minSort() {

        if (header.next == null || header.next.next == null) return;

        Node current = header.next;

        while(current != null){

            Node nextMinNode = minNode(current);
            swap(current, nextMinNode);
            current = current.next;

        }
    }


    public void swap(Node n1, Node n2) {

        String temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;

    }

    public Node minNode(Node head) {

        Node minNode = head;
        String minValue = head.value;

        while(head != null) {
            if (head.value.compareTo(minValue) < 0) {
                minNode = head;
                minValue = minNode.value;
            }
            head = head.next;
        }
        return minNode;
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        var list = new MyStringLinkedList();
       // list.addLast("Rich");
        //System.out.println(list);
        //list.removeLast();
        //System.out.println(list);
        System.out.println("Pre-Sorted");
        list.addFirst("Bob");
        list.addFirst("Harry");
        list.addFirst("Charles");
        list.addFirst("Violin");
        list.addFirst("Zebra");
//        list.addFirst("1");
//        list.addFirst("2");
//        list.addFirst("3");
//        list.addFirst("5");



        //list.remove("Harry");

        //System.out.println(list);
        //list.removeLast();
        System.out.println(list);
//		System.out.println(list.search("Harry"));
//		System.out.println(list.search("Bob"));
//		list.addLast("Tom");
//		System.out.println(list);

        list.minSort();
        System.out.println("Post-Sort");
        System.out.println(list);
    }
}
