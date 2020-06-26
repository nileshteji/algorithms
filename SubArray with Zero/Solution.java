
import java.util.HashMap; 

class MaxLenZeroSumSub { 

	
	static int maxLen(int arr[]) 
	{ 
	
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>(); 

		int sum = 0; 
		int max_len = 0; 

		for (int i = 0; i < arr.length; i++) { 
		
			sum += arr[i]; 

			if (arr[i] == 0 && max_len == 0) 
				max_len = 1; 

			if (sum == 0) 
				max_len = i + 1; 

		 
			Integer prev_i = hM.get(sum); 

			//This is checking for the sum if it is present in the hashmpa or not 
			if (prev_i != null) 
				max_len = Math.max(max_len, i - prev_i); 
			else 
				hM.put(sum, i); 
		} 

		return max_len; 
	} 

	
	public static void main(String arg[]) 
	{ 
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 }; 
		System.out.println("Length of the longest 0 sum subarray is "
						+ maxLen(arr)); 
	}
} 





// Explaination


// In this we will take a varoable by the the name of Current Sum and MaxLength
// which will be our final answer;
// So if we see current_Sum which is zero then we update the length of the maxLength
// to i +1;

// if see unique Current_Sum value we will be put the current sum into hashmap 
// with the index of the current_sum and 
// if see that the current sum repeats itself then it means that the numbers
// in between the previous current_sum and the present  current_sum is zero 
// so we find the mx val of the maxlength and the index of present current sum 
// previous sum 