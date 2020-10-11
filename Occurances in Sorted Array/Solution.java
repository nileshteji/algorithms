public class Solution {
    public static void main(String[] args) {
        int array[]={5,5,5,5,5,5,5};
        int a=5;
        int i =solve(array,0,array.length-1,a);
        if(i!=-1){
           int first=first(array,0,i-1,a);
           int last=last(array,i+1,array.length-1,a);
    
           System.out.println(first+" "+last);
    
        }
        else{
            System.out.println("No occurances");
        }
    }
  

static int first(int[] array,int low,int high,int key){
    int res=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(array[mid]==key){
           res=mid;
           high=mid-1;
        }
        else if(array[mid]<key){
            low=mid+1;
        }
        else if(array[mid]>key){
            high=mid-1;
        }
    }
    return res;
}
static int last(int[] array,int low,int high,int key){
    int res=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(array[mid]==key){
           res=mid;
           low=mid+1;
        }
        else if(array[mid]<key){
            low=mid+1;
        }
        else if(array[mid]>key){
            high=mid-1;
        }
    }
    return res;

}

static int solve(int[] array,int low,int high,int a){
    while(low<=high){
        int mid=low +(high-low)/2;

        if(array[mid]==a){
            return mid;
        }
        else if(array[mid]>a){
             high=mid-1;
        }
        else if(array[mid]<a){
            low=mid+1;
        }
    }
    return -1;
}
}
