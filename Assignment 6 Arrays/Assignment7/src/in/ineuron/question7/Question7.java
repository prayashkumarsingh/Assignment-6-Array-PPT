package in.ineuron.question7;

public class Question7 {
	public static int[][] matrix(int n) {
	    int[][] ans = new int[n][n];
	    int count = 1;

	    for (int min = 0; min < n / 2; ++min) {
	      final int max = n - min - 1;
	      for (int i = min; i < max; ++i)
	        ans[min][i] = count++;
	      for (int i = min; i < max; ++i)
	        ans[i][max] = count++;
	      for (int i = max; i > min; --i)
	        ans[max][i] = count++;
	      for (int i = max; i > min; --i)
	        ans[i][min] = count++;
	    }

	    if (n % 2 == 1)
	      ans[n / 2][n / 2] = count;

	    return ans;
	  }
	public static void main(String[] args) 
	{
		
		int n = 3;
		for(int[] element : matrix(n)) {
			for(int elements : element)
			{
				System.out.print(elements);
			}
		}	    
	}

}
