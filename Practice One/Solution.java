class Solution {
    public static void main(String[] args) {
        String a = "aaaabbbbcccc";
        StringBuffer stringBuffer=new StringBuffer(a);
        String res=" ";

        int min = Integer.MAX_VALUE;
        int index=0;


        while(stringBuffer.length()!=0){

        while(index<stringBuffer.length()){
            if(min!=Integer.MAX_VALUE && min < (int) stringBuffer.charAt(index)){
                    res=res+a.charAt(index);
                    min=(int)a.charAt(index);
                    stringBuffer.deleteCharAt(index);
                  
            }
            else if((int) stringBuffer.charAt(index) < min){
                     res=res+stringBuffer.charAt(index);
                     min=(int)stringBuffer.charAt(index);
                     stringBuffer.deleteCharAt(index);
                     
            }
            
            index++;
           
        }

        System.out.println(stringBuffer.toString());
        System.out.println(res);
        break;

      
       
       }
    }
        
    }