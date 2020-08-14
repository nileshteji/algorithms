

class Disjoint {
    int[] rank;
    int[] parent;
    int number;

    public Disjoint(int number) {
        this.number = number;
        rank = new int[number];
        parent = new int[number];
        makeSet();
    }

    void makeSet(){
        for(int i=0;i<number;i++){
            parent[i]=i;
        }
    }

    int  find(int a){
        if(parent[a]!=a){
            parent[a]=find[parent[a]];
        }
        return parent[a];
    }



    
    void union(int a, int b) {
        int aRep=find(a);
        int bRep=find(b);

        if(aRep==bRep){
            return;
        }

        if(rank[aRep]<rank[bRep]){
            parent[aRep]=bRep;
            
        }
     
        if(rank[bRep]<rank[aRep]){
            parent[bRep]=aRep;
        }
        if(rank[aRep]==rank[bRep]){
            parent[bRep]=aRep;
            rank[aRep]++;
        }


    }
}

public class Solution {
    public static void main(String[] args) {

    }
}