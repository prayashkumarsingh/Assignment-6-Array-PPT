package in.ineuron.question1;

public class Question1 {
	public static int[] string(String s) {
	    final int n = s.length();
	    int[] ans = new int[n + 1];
	    int min = 0;
	    int max = n;

	    for (int i = 0; i < n; ++i)
	      ans[i] = s.charAt(i) == 'I' ? min++ : max--;
	    ans[n] = min;

	    return ans;
	  }
	public static void main(String[] args) 
	{
		String s = "IDID";
		for (int element : string(s))
			  
            System.out.print(element);
	}

}
