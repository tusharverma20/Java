// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
   int arr[]={1,2,3,4,5,6,7};
   int n= arr.length;
   int k;
   Scanner sc= new Scanner(System.in);
   k=sc.nextInt();
   
   
        for(int i =0;i<n-k;i++){
            for(int j =0;j<n-1;j++){
            int temp = arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
        }
   }
        for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
        
        
         }
    }
}
