
#include<bits/stdc++.h>
using namespace  std;
int* parent ;
void initialize(int n)
{
    parent=new int[n];
    for(int i=0;i<n;i++)
    {
        parent[i]=i;
    }
}

int find(int x)
{
    if(parent[x]==x)
        return x;
    else return(find(parent[x]));

}

void makeFriend(int x,int y)
{
    int x_rep=find(x);
    int y_rep=find(y);
    if(x_rep==y_rep)
        return;
    parent[y_rep]=x_rep;

}

bool isFriend(int f1,int f2)
{
     int x_rep=find(f1);
    int y_rep=find(f2);
    if(x_rep==y_rep)
        return true;
    return false;
}
int main()
{
    //0,1,2,3,4


    initialize(5);
    makeFriend(0,1);
    makeFriend(0,2);
    makeFriend(3,4);
    makeFriend(4,0);
    if(isFriend(1,3))
    {
        cout<<"Yes"<<endl;
    }
    else
    {
        cout<<"No";
    }
}
