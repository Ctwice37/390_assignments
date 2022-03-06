package assignment_4.prog3.employeeinfo;

import java.util.Arrays;

public class AccountList {

    private Account savingsAcct;
    private Account retirementAcct;
    private Account checkingAcct;

    private final int INITIAL_LENGTH = 2;
    private String[] strArray;
    private int size;

    public AccountList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void createNewSavings(double startBalance){
        checkingAcct = new Account(this, AccountType.SAVINGS, startBalance);
    }

    public void createNewChecking(double startAmount) {}

    public void createNewRetirement(double startAmount) {}




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
        for(int i = 0; i < size; i++){
            if(strArray[i].equals(s)){
                for(int j = i; j < size; j++){
                    strArray[i] = strArray[i+1];
                }
                size--;
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

        String s = "[";
        for(int i = 0; i < size; i++){
            if(i != size -1) {
                s += strArray[i] + ", ";
                continue;
            }
            s+= strArray[i];

        }
        s += "]";

        return s;
    }
    public int size() {
        return size;
    }
}
