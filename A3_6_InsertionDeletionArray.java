
import java.io.*;

class Hello {
	static void insertElement(int arr[], int n, int x,
							int pos)
	{
		
		for (int i = n - 1; i >= pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = x;
	}
	
	 static int findElement(int arr[], int n, int key)
    {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
 
        return -1;
    }
    
	 static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
 
        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }
    
	public static void main(String[] args)
	{
		int arr[] = new int[15];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 1;
		arr[3] = 8;
		arr[4] = 5;
		int n = 5;
		int x = 10, pos = 2;
        int key=4;
        
		System.out.print("Before Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		
		insertElement(arr, n, x, pos);
		n += 1;

		System.out.print("\n\nAfter Insertion: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
			
			 n = deleteElement(arr, n, key);
 
        System.out.print("\n\nAfter deletion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}
}

