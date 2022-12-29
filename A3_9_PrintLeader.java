
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
   int arr[]={17,4,3,5,2};
   int n= arr.length;
int k=1;
int[] arr2 = new int[20];

        for(int i =0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
             
            }
          if (j == n) 
                System.out.print(arr[i] + " ");
        }
    }
}
