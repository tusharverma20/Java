// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        
        int start , end;
        start=sc.nextInt();
         end=sc.nextInt();
         sc.close();
         
         for(int i=start;i<end;i++){
             System.out.print(str.charAt(i));
         }
    }
}
