package prac;

import java.util.HashMap;

public class occuranceWithMap {
    public static void main(String[] args) {
        String str="hbsdhb";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(char ch : str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);


        }System.out.println(hm);
    }
}
