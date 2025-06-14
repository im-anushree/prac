package prac;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintDupCharsInString {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int count = 0;
//CREATE SET TO FETCH ALL CHARACTERS USED IN STRING BY SHOWING DUPLICATE CHARS IN INSERTION ORDER
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for (int i = str.length() - 1; i >= 0; i--) {

            lhs.add(str.charAt(i));
        }
        System.out.println("the characters occured are: "+lhs);
        for (Character ch : lhs) {   // Characters not char as the components are of set with characters object
            for(int i = str.length()-1; i >= 0; i--){
                /*Step-2 Compare each character of the set with all characters in the string*/
                if (ch.equals(str.charAt(i))){
                    count++;

                }
            }
            if(count>=2){System.out.println("Char "+ch+" occurance count is "+count);}
            count=0;
        }
    }
}

