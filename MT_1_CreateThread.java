import java.io.*;

public class ExampleClass implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
        ExampleClass ex = new ExampleClass();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("Hi");  
    }  
}  



class Threadrun extends Thread {
    public void run()
    {
        System.out.print("Welcome to CU.");
    }
    public static void main(String[] args)
    {
        Threadrun t = new Threadrun(); // creating thread
        t.start(); // starting thread
    }
}
