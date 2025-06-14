package prac;

import java.util.Scanner;

public class paliandrome {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        char rev;
        String revstring="";
        System.out.println(str.length());
        for(int i=str.length()-1; i>=0;i--){

            rev=str.charAt(i);
            revstring=revstring+rev;
            System.out.println(revstring);
        }
        if (revstring.equals(str)){
            System.out.println("its paliandrome");
        }else{
        System.out.println("not a paliandrome");
    }
}}
