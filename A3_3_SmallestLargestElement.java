

 class Solution {
     public static void main(String[] args){
int max=0;

    int[] arr = {3,7,1,4,9,6};
    int min=arr[0];
    int n = arr.length;
    
    for(int i=0;i<n;i++){
        if(arr[i]>max)
        max=arr[i];
        
        if(arr[i]<min)
        min=arr[i];
    }
    
    System.out.println("Maximum: "+max);
    System.out.println("Minimum: "+min);
    }
}
