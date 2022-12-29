
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
   int arr[]={1,2,3,4,5,6};
   int n= arr.length;
   int miss=0;
   Scanner sc = new Scanner(System.in);
   int N=sc.nextInt();
  
  
int[] arr2 = new int[N];

   Arrays.sort(arr);
        for(int i =0;i<N;i++){
            arr2[i]=i+1;
        }
           
            for(int i =0;i<n;i++){
            if(arr[i]!=arr2[i]){
                miss=i;
            }
            else
            miss=arr2[n];
        }
   
   System.out.print(miss);
      
    }
}
