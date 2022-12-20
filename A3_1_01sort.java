// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
 class HelloWorld {
    public static void main(String[] args) {
      int arr[]={0,0,1,1,0,1,0,1,1,0,0,0,1};
      int size=arr.length;
      int count=0;
      for(int i=0;i<size;i++){
          if(arr[i]==0)
          count++;
      }
      
      for(int i=0;i<count;i++){
          arr[i]=0;
      }
      for(int i=count;i<size;i++){
          arr[i]=1;
      }
      
      for(int i=0;i<size;i++){
          System.out.print(arr[i]+", ");
      }

      
    }
}
