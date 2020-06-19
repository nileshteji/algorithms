// Java program to print all permutations of a 
// given string. 
 class Permutation{
     int index=1;
	public static void main(String[] args) 
	{ 
		String str = "Nilesh"; 
		int n = str.length(); 
		Permutation permutation = new Permutation(); 
		permutation.permute(str, 0, n-1); 
	} 

	
	private void permute(String str, int l, int r) 
	{ 
		if (l == r) {
            System.out.println(index+" "+str);
            index++; 
        }
		else    
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r); 
				str = swap(str,l,i); 
			} 
		} 
	} 

	//rn swapped string 
	
	public String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 

} 

// This code is contributed by Mihir Joshi 
