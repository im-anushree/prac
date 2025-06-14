package prac;

import java.util.Scanner;

public class sumOfAllNumbersInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num=0;
        int sum=0;
        System.out.println("Enter string");
        for (int i=0; i<str.length(); i++){
             if ((str.charAt(i)>='0' && str.charAt(i)<='9')) {

                num=str.charAt(i)-48;
                sum=sum+num;
            }
        }System.out.println("sum of num are:"+sum);
    }
}


