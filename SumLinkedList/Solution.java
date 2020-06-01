class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }

 
}


//7->5->4->9->6
//8 -> 4
class Solution{
    public static void main(String[] args) {

        Node list1=new Node(7);
      
        list1.next=new Node(5);
        list1.next.next=new Node(9);
        list1.next.next.next=new Node(6);
       
       
        


        findSum(list1);



        
    }



    static void findSum(Node a){

        while(a!=null){
            System.out.println(a.data);
            a=a.next;
        }

    






     
    }
}