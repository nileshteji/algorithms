class SOlution{


static void merge(int[] array,int l,int m ,int r){












}

  static void sort(int[] array,int l,int r){

    if(l<r){


//int arr[] = { 12, 11, 13, 5, 6, 7 };
// 12 11 13

        int m=(l+r)/2;

        sort(array,l,m);



        sort(array,m+1,r);


        merge(array,l,m,r);









    }
  }























public static void main(String[] args) {







}

}
