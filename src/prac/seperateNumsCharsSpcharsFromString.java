package prac;

import java.util.Scanner;

public class seperateNumsCharsSpcharsFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String al="";
        String num="";
        String spc="";
        System.out.println("Enter string");
        for (int i=0; i<str.length(); i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||((str.charAt(i)>='A'&&str.charAt(i)<='Z'))){
al=al+str.charAt(i);
            } else if ((str.charAt(i)>='0' && str.charAt(i)<='9')) {

                num=num+str.charAt(i);
            }else{
                spc=spc+str.charAt(i);
            }
        }System.out.println("alp are:"+al+" num are:"+num+" sp chars are:"+spc);
    }
}
