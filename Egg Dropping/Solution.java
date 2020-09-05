
public class EggSolver {
    public static void main(String[] args) {
        System.out.println(new EggSolver().solveUsingDp(8, 4));
    }



    /**
     * @param n== number of eggs
     * @param k==number of floors
     */
    public int solveUsingDp(int n, int k) {
        final int results[][] = new int[n + 1][k + 1];


        // when we have one floor we only have to do one trial 
        // when we have zero floors no trial will be held 
        for (int i = 0; i < n + 1; i++) {
            results[i][1] = 1;
            results[i][0]=0;
        }
        // when we have one egg then we have to do the trial for k floors 
        for (int i = 0; i < k + 1; i++) {
            results[1][i] = 1;
        }


        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < k + 1; j++) {
                results[i][j] = Integer.MAX_VALUE;

                // This case if for finding the minium attemps 
                for (int x = 1; x < i; x++) {
                    // when the egg breaks j
                    // since in this the egg breaks then we have to check down 
                    final int brokenEggResult = results[x - 1][j - 1];
                    final int EggSurvivedResult = results[i - x][j];
                    int temp = Math.max(brokenEggResult, EggSurvivedResult) + 1;
                    if (temp < results[i][j]) {
                        results[i][j] = temp;
                    }
                }
            }
        }
        for (final int[] a : results) {
            System.out.println(Arrays.toString(a));
        }
        return results[n][k];
    }
}