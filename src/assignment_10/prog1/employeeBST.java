package assignment_10.prog1;

import java.util.Comparator;

public class employeeBST {
    private Node root;
    private NameComparator comparator;

    public employeeBST(NameComparator comparator) {
        root = null;
        this.comparator = comparator;
    }


    private class Node {

        // Constructors
        Node(Employee emp) {
            this(emp, null, null);
        }

        Node(Employee emp, Node left, Node right) {
            this.emp = emp;
            this.left = left;
            this.right = right;
        }

        private Employee emp; // The data in the node
        private Node left; // Left child
        private Node right; // Right child
    }

//    private void printTree(MyBST.Node t) {
//        if (t != null) {
//            printTree(t.left);
//            System.out.println(t.element);
//            printTree(t.right);
//        }
//    }


    public void insert(Employee emp) {
        if (root == null) {
            root = new employeeBST(new NameComparator);
        }
        else {
            MyBST n = root;
            boolean inserted = false;
            while(!inserted){
                if(x.compareTo(n.element)<0) {
                    //space found on the left
                    if(n.left == null){
                        n.left = new MyBST(emp,null,null);
                        inserted = true;
                    }
                    else {
                        n = n.left;
                    }
                }

                else if(emp.compareTo(n.element)>=0){
                    //space found on the right
                    if(n.right==null){
                        n.right = new MyBST.Node(emp,null,null);
                        inserted = true;
                    }
                    else {
                        n = n.right;
                    }
                }

            }

        }
    }

}