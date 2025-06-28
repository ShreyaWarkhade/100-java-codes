package ConditionsAndLoops;

import java.util.Scanner;

public class NoisPositiveNegative {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);

        System.out.print("Enter a no.: ");
        int a=in.nextInt();


        if(a<0){
            System.out.println("Negative");
        }
        else if (a>0) {
            System.out.println("Positive");
        }
        else{
            System.out.println("Zero");
        }


        //Using Nested if-else Statements
        if (a >= 0) {
            if (a == 0) {
                System.out.println("Zero");
            }else{
                System.out.println("Positive");

            }

        }
        else{
            System.out.println("Negative");
        }


       // Using Ternary Operator
        if (a == 0) {
            System.out.println("zero");
        }
        else {
            String result=a>0? "No. is Positive ":"no. is negative";
            System.out.println(result);
        }


    }
}
