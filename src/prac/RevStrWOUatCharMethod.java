package prac;//reverse string without using charAt method

import java.util.Scanner;

public class RevStrWOUatCharMethod {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        char[] ch= str.toCharArray();
        String rev="";
        int count=0;
        for(char c :ch){
            count++;
        }
        for(int i=count-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}


