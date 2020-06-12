class Solution{
  public static void main(String[] args) {



    System.out.println(solve(28,14));



  }

//Eucledian ALgorithm

  static int solve(int a,int b){
  if(a==0){
    System.out.println(a+" "+b);
    return b;

  }
  System.out.println(a+" "+b);

  return solve(b%a,a);
  }
}
