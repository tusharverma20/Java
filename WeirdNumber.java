import java.util.Scanner; 
class HelloWorld {
     
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       if(num%2==0){
           if(num>20 || num<0)
           System.out.println("Not Weird");
           else 
           System.out.println("Weird");
       }
       else
        System.out.println("Weird");
    }
}
