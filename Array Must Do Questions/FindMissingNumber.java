public class FindMissingNumber {
    //function to find missing number
    static int getMissingNo(int a[], int n){
        int x1 = a[0];
        int x2 = 1;
        //for XOR of all the elements in array
        for(int i =1; i<n; i++)
            x1 = x1^a[i];
        //for XOR of all the elements from 1 to n+1
        for(int i =2; i<=n+1; i++)
            x2 = x2^i;
        return (x1^x2);
    }
    //Driver Code
    public static void main(String[] args){
        int arr[] = {1,2,3,5};
        int N = arr.length;
        //function call
        int miss = getMissingNo(arr, N);
        System.out.println(miss);
    }
}
