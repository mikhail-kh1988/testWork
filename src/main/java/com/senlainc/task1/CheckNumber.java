package com.senlainc.task1;

public class CheckNumber {

    public boolean numberIsEven(int num){
        return num%2==0 ? true : false;
    }

    public boolean numberIsComposite(int num){
        int temp;
        boolean type = true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                type = false;
                break;
            }
        }
        return type;
    }

}
