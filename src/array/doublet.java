//find the diublet in the array whose sum is equal to the given value x
package array;

public class doublet {
    public static void main(String[] args) {
        int arr[]={3,-1,8,5,4,9};
        int x = 9;  // target sum
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for(int j=i+1;j<n;j++){
                // pehle i=0 pe rahega aur j=1 pe rahega aur j aage tk check krega ki kisi ka sum
                // ith index ke element se krne pe 9 aa rha h ya ni
                //j ke end tk chevck krne k bad i ki value 1 ho jayegi aur j = 2 se aage tk jayega
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
