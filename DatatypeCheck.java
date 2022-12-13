
 import java.util.*;  
 public class Main {
    public static void main(String[] args) {
       int i ;
       double f ;
       String str;
       
       Scanner sc= new Scanner(System.in);
       i=sc.nextInt();
       f=sc.nextDouble();
        sc.nextLine();    
       str=sc.nextLine();
       sc.close();
       
       String checkstr= str.getClass().getSimpleName();
       String checkint=((Object)i).getClass().getSimpleName();
       String checkdo= ((Object)f).getClass().getSimpleName();
       
      System.out.println(checkstr+": "+str);
        System.out.println(checkdo+": " + f);
        System.out.println(checkint+": " + i);
    }
}
