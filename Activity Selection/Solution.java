// The following implementation assumes that the activities 
// are already sorted according to their finish time 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class ActivitySelection 
{ 
	public static void printMaxActivities(int s[], int f[], int n) 
	{ 
        int i =0;

        for (int j = 1; j < f.length; j++) {
        
           if(f[i]<s[j]){
               System.out.println(j);
               i=j;
           }



        }
	} 
	
	// driver program to test above function 
	public static void main(String[] args) 
	{ 
        // This is only when the Activties are sorted otherwise we have to sort the activities 
        // which will lead to the creation of the POJO Class.
	int s[] = {1, 3, 0, 5, 8, 5}; 
	int f[] = {2, 4, 6, 7, 9, 9}; 
	int n = s.length; 
		
	printMaxActivities(s, f, n); 
	} 
	
}