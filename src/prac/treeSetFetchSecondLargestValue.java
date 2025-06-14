package prac;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class treeSetFetchSecondLargestValue {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2,6,5,3,4,4,3);  //Arrays not Array
        //Remove duplicate
        TreeSet<Integer> ts = new TreeSet<Integer>(ls);
        System.out.println(ts);
        Integer SecondLargest = ts.lower(ts.last());
        System.out.println(SecondLargest);
    }



}
