package assignment_7.prog2;

public class MinSort {

    //StringBuilder sb;
    char[] c;

    public String sort(String s){

        StringBuilder sb = new StringBuilder();
        c = s.toCharArray();

        if(s.length() == 0)
            return "";

        int minCharPos = minPos(0, c.length);
        swap(minCharPos, 0);

        String string = new String(c);

        return sb.append(string.charAt(0)) + sort(string.substring(1));
    }

    int minPos(int i, int j) {
        int pos = i;
        char min = c[i];
        for (int k = i + 1; k < j; ++k) {
            if (c[k] < min) {
                pos = k;
                min = c[k];
            }
        }
        return pos;
    }

    void swap(int i, int k){
        char temp = c[i];
        c[i] = c[k];
        c[k] = temp;
    }

    public static void main(String[] args) {
        MinSort m = new MinSort();


        System.out.println(m.sort("zyxcba"));

    }

}
