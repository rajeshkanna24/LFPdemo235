package com.rajesh;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TwoUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age:");
        int num = sc.nextInt();
        System.out.println("What is your number");
        int number = sc.nextInt();
          if(num>number){
              System.out.println(num+"greater than"+number);
          }
          else {
              System.out.println(number+"greater than"+num);
          }

    }
}
