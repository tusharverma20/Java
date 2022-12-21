// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[] arr= {1,4,7,9,3};
        int n=arr.length;
        int min=0;
        
        for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(i-j>0){
                     min=i-j;
                 }
        }
       
    }
     System.out.println("Minimum Distance is: "+min);
}
}
