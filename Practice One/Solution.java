import java.util.Scanner;

import jdk.jfr.Percentage;

class Solution{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        if(scan.next().equalsIgnoreCase("Y")){
           String child=scan.next();
           String[] childArray=child.split(",");
           int temp=childArray.length+1;
           System.out.println("TOTAL MEMBERS:"+temp);
           System.out.println("COMMISSION DETAILS");
           int answer= childArray.length * (500);
           System.out.println(a+":"+answer);
           for(String s : childArray){
               System.out.println(s+":"+(500/2));
           }

        }
        else{

        }
    }
}