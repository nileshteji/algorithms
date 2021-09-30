class Solution{
	public static void main(String[] args) {
		int[] coins={1,4,6};
		int sum=7;
	int a=	solve(coins, sum);
System.err.println(a);



	}



	// Calculate the total number of ways to give the change 

	public static int solve(int[] coins,int sum){
		int[][] matrix=new int[coins.length+1][sum+1];

		for(int i =1;i<matrix[0].length;i++){
			matrix[0][i]=0;
		}

		for(int i =0;i<matrix.length;i++){
			matrix[i][0]=1;
		}

		for(int i =1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){

                         if(coins[i-1]<=j){
                            matrix[i][j]=matrix[i-1][j]+matrix[i][j-coins[i-1]];
						 }
						 else{
							 matrix[i][j]=matrix[i-1][j];
						 }
				}
			}
			return matrix[coins.length][sum];
		}


	}
