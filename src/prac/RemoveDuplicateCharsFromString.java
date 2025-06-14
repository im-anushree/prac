package prac;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharsFromString {

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int count = 0;
        //CREATE SET TO GET ALL CHARACTERS IN STRING WITHOUT DUPLICATE
LinkedHashSet<Character> finalSet = new LinkedHashSet<Character>();
        LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
        for (int i = str.length() - 1; i >= 0; i--) {
            lhs.add(str.charAt(i));
        }
        System.out.println("the characters occured are: "+lhs);
        for (Character ch : lhs) {   // Characters not char as the components are of set with characters object
            for(int i = str.length()-1; i >= 0; i--){
                if (ch==str.charAt(i)){
                    count++;

                }
            }
            if(count>=2){
                finalSet.add(ch);
            }
            count=0;
            System.out.print(ch);
        }
    }
}


