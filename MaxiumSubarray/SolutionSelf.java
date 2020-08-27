import javax.management.MXBean;

public class SolutionSelf {



    public static void main(String[] args) {
        int[] array={2,-5,6,7,8};
       System.out.println( maxiumSubarray(array)  );
          }


   public static int  maxiumSubarray(int[] array){


    int maxium_product_here=1;
    int minium_product_here=1;
    int overall_max=1;
    int flag=0;

for (int i = 0; i < array.length; i++) {
    
//this deals with all the positive integers
    if(array[i]>0){
        //this will look like this 
        //1*2
        maxium_product_here=maxium_product_here*array[i];
        minium_product_here=Math.min(minium_product_here*array[i], 1);
        flag = 1;

    }
//this deals with all the zero elements of 
    else if(array[i]==0){
        maxium_product_here=1;
        minium_product_here=1;

    }
    //this deals with all the negative integers
    // 2 -5 -6 7 8 
    // 
    else {
     int temp=maxium_product_here;
       maxium_product_here=Math.max(minium_product_here*array[i], 1);
       minium_product_here=temp*array[i];
    }

    if(overall_max<maxium_product_here){
        overall_max=maxium_product_here;
    }



}




return overall_max;






    }
    
}



// Working of the Algorithm 


// 2 -5, -6 ,7 ,8 


// max =30
// min=30
//overall =2