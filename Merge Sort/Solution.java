class SOlution{


static void merge(int[] array,int l,int m ,int r){


  int n1 = m - l + 1;
          int n2 = r - m;

          /* Create temp arrays */
          int L[] = new int[n1];
          int R[] = new int[n2];

        
          for (int i = 0; i < n1; ++i)
              L[i] = arr[l + i];
          for (int j = 0; j < n2; ++j)
              R[j] = arr[m + 1 + j];


          int i = 0, j = 0;


          int k = l;
          while (i < n1 && j < n2) {
              if (L[i] <= R[j]) {
                  arr[k] = L[i];
                  i++;
              }
              else {
                  arr[k] = R[j];
                  j++;
              }
              k++;
          }

          /* Copy remaining elements of L[] if any */
          while (i < n1) {
              arr[k] = L[i];
              i++;
              k++;
          }

          /* Copy remaining elements of R[] if any */
          while (j < n2) {
              arr[k] = R[j];
              j++;
              k++;
          }









}

  static void sort(int[] array,int l,int r){

    if(l<r){


//int arr[] = { 12, 11, 13, 5, 6, 7 };
// 12 11 13   ---->    12 11  13  ----> 12    11    13
// 5  6  7
        int m=(l+r)/2;

        sort(array,l,m);



        sort(array,m+1,r);


        merge(array,l,m,r);









    }
  }























public static void main(String[] args) {







}

}
