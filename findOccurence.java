

class HelloWorld {
     static int find(String s,char m, int i){
         if(i>=s.length())
         return 0;
         int count =0;
            if(s.charAt(i)==m)
            count++;
            
             return count + find(s,m,i+1);
        }
     
    public static void main(String[] args) {
        String s= "BUFFALO";
        char m = 'F';
       int result=find(s,  m , 0);
        System.out.println(result);
    }
}
