import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Calculator {
    int left, right;
    public void setOperator(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator{
    public void substract(){
        System.out.println(this.left - this.right);
    }
}

public class reJava {
    public static void main (String[] args){
        SubstractionableCalculator c2 = new SubstractionableCalculator();
        c2.setOperator(124,23);
        c2.avg();
        c2.sum();
        c2.substract();
    }
}
