package prac;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class OccuranceOfEachWordInString {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    String[] str =  s.split(" ");
    int count=0;
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();

   for(int i=0; i<str.length; i++)
    {
        lhs.add(str[i]);
    }
for(String  word: lhs){
    for(int j=0; j<str.length; j++){
        if(word.equals(str[j])){
            count++;
        }
    }System.out.println(word+" "+count);
    count=0;
}

    }

}
