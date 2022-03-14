package sortroutines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import runtime.Sorter;

public class BSTSort extends Sorter {
	/** The tree root. */
	private Node root;

	// It takes as input an array and builds a BST tree from it.
	public void insertAll(int[] array) {
		Integer x;
		for (int i = 0; i < array.length; i++) {
			x = array[i];
			if (root == null) {
				root = new Node(x, null, null);
			} else {
				Node n = root;
				boolean inserted = false;
				while (!inserted) {
					if (x.compareTo(n.element) < 0) {
						// space found on the left
						if (n.left == null) {
							n.left = new Node(x, null, null);
							inserted = true;
						} else {
							n = n.left;
						}
					}

					else if (x.compareTo(n.element) >= 0) {
						// space found on the right
						if (n.right == null) {
							n.right = new Node(x, null, null);
							inserted = true;
						} else {
							n = n.right;
						}
					}

				}

			}
		}
	}

	// It traverses the BST and returns all its elements in a sorted array public
	int[] readIntoArray() {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			System.out.println("Empty tree");
		else {
			readIntoArrayHelper(root, list);
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

	void readIntoArrayHelper(Node t, List list) {
		if (t != null) {
			readIntoArrayHelper(t.left, list);
			list.add(t.element);
			readIntoArrayHelper(t.right, list);
		}
	}

	@Override
	public int[] sort(int[] arr) {
		BSTSort bstSort = new BSTSort();
		bstSort.insertAll(arr);
		bstSort.readIntoArray();
		return null;

	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 7, 3, 8, 2, 6, 9 };
		BSTSort bstSort = new BSTSort();
		bstSort.insertAll(arr1);
		System.out.println(Arrays.toString(bstSort.readIntoArray()));
	}

	private class Node {

		// Constructors
		Node(Integer theElement) {
			this(theElement, null, null);
		}

		Node(Integer element, Node left, Node right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element; // The data in the node
		private Node left; // Left child
		private Node right; // Right child
	}
}