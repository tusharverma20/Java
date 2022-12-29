
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[] = new int[size];   
        for(int i=0;i<size;i++){
          numbers[i]= sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<numbers.length ;i++){
            if(numbers[i] == x){
            System.out.println(i);
            }
        }
    }
}

        
        
    
