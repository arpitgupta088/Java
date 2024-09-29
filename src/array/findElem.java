package array;
import java.util.*;
public class findElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter target elements");
        int x= sc.nextInt();
        System.out.print("enter array size");
        int n= sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter array elemetys");
        for (int i=0;i<arr.length;i++){         //or we can write n instead of arr.lrngth
            arr[i]=sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==x){
//                System.out.println("found");
//                break;
          boolean flag = false;  //means element not found
          for (int i = 0; i < arr.length; i++) {
              if(arr[i]==x){
                  flag = true;
                  break;
    }
        }
          if(flag == true){
              System.out.println("element found");}
              else{
                  System.out.println("not found");
          }
    }
}
