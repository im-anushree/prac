import java.util.LinkedHashSet;
import java.util.Scanner;

public class prac {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        int count=0;

        for (int i = 0; i<str.length(); i++){
            lhs.add(str.charAt(i));
        }
        for(Character c: lhs){
            for(int j=0; j<str.length();j++){
            if(c==str.charAt(j)){
                count++;
            }


            }System.out.println(c+" "+count);
            count=0;
        }

    }
}

