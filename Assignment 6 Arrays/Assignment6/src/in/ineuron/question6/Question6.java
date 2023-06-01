package in.ineuron.question6;

import java.util.*;

public class Question6 {
	public static int[] originalArray(int[] changed) {
		List<Integer> ans = new ArrayList<>();
		Queue<Integer> q = new ArrayDeque<>();

		Arrays.sort(changed);

		for (final int num : changed)
			if (!q.isEmpty() && num == q.peek()) {
				q.poll();
			} else {
				q.offer(num * 2);
				ans.add(num);
			}

		return q.isEmpty() ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 6, 8 };

		for (int element : originalArray(nums))

			System.out.print(element);

	}

}
