package com.nishant;
import java.util.Scanner;
public class Stuff{
    public static void main(String[] args) {
        while(true){
            System.out.println();
            System.out.print("enter a number to check if its an Armstrong number or not: ");
            Scanner in = new Scanner(System.in);
            int num;
            num = in.nextInt();
            int num2 = num;
            int a = 0;
            while(num>0){
                int lastdigit;
                lastdigit = num%10;
                num = num/10;
                a = a + cube(lastdigit);
            }
            if(a == num2){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
    static int cube(int a){
        int i = a * a * a;
        return i;

    }
}