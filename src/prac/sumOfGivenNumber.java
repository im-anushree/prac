package prac;

import java.util.Scanner;
//WAPT give sum of each digit in a given number

 public class sumOfGivenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        int sum=0;
        //1234
                while(num>0){
             int rem = num % 10;
             sum = sum + rem;
             num=num/10;
        }
                System.out.println("sum of numbers is :"+sum);

    }
}
