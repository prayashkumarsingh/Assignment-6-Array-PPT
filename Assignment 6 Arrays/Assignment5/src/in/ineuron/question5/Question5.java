package in.ineuron.question5;

import java.util.Arrays;

public class Question5 {
	public static int productSum(int[] nums1, int[] nums2) {
        int ans = 0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        
        int i = 0;
        int j = nums2.length-1;       
        while(i < nums1.length && j >= 0)
        {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }
        
        return ans;
    }
	public static void main(String[] args) 
	{
		int[] num1 = {5,3,4,2};
		int[] num2 = {4,2,2,5};
		
		System.out.print(productSum(num1,num2));
			    
	}

}
