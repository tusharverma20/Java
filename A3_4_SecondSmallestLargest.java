

 class Solution {
     public static void main(String[] args){
int max=0;

    int[] arr = {3,7,1,4,9,6};
    int min=arr[0];
    int n = arr.length;
    
    for(int i=0;i<n;i++)    
        {
            for(int j=i+1;j<n;j++)    
            {
                if(arr[i]<arr[j])     
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println("Second Largest element is "+arr[1]);   
        System.out.println("Second Smallest element is "+arr[n-2]);  
    
    }
}
