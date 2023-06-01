package in.ineuron.question3;

public class Question3 {
	public static boolean mountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int n = arr.length - 1;
        while (i + 1 < n && arr[i] < arr[i+1]) {
            i++;
        }

        while (j > 0 && arr[j] < arr[j-1]) {
            j--;
        }

        return (i > 0 && i == j && j < n);
    }
	public static void main(String[] args) 
	{
		int[] arr = {0,2,3,4,5,2,1,0};
		
		System.out.print(mountainArray(arr));
			    
	}

}
