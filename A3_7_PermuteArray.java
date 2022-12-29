
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
   int arr[]={1,2,3,4,5,6,7};
   int n= arr.length;
   
   System.out.print("Original Array: ");
   for(int i =0;i<n;i++)
        System.out.print(arr[i]+" ");
   
        for(int i =0;i<1;i++){
            for(int j =0;j<n-1;j++){
            int temp = arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
   }
   System.out.print("\nPermuted Array: ");
        for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
        
        
         }
    }
}
