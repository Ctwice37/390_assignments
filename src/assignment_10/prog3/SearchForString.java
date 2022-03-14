package assignment_10.prog3;

public class SearchForString {
    private String[] arr;

    public SearchForString(String[] arr) {
        this.arr = arr;
    }

    public boolean search(String s) {
        return recurSearch(s, arr.length - 1);
    }

    private boolean recurSearch(String s, int upperIndex) {
        if (arr[upperIndex].equals(s))
            return true;

        else if (upperIndex == 0 && !(arr[upperIndex].equals(s)))
            return false;

        else
            return recurSearch(s, upperIndex - 1);


    }


    public static void main(String[] args) {
        String[] s = {"Charle", "Sam", "Emmie"};

        SearchForString ss = new SearchForString(s);

        System.out.println(ss.search("f"));


    }
}

