package array;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr  = new ArrayList<>(5); // initial capacity of 5 (size is still 0)
        arr.add(10); // index 0
        arr.add(20); // index 1
        arr.add(30); // index 2
        arr.add(40); // index 3
      //  System.out.println(arr);  //will print whole array

        // Loop through valid indices only (size is 4, so indices are 0 to 3)
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }

        arr.set(2,300);    // modify elements
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();   //just to print elements in next line

        arr.remove(3);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
