#include<iostream>

//Perform search del, instert in array in O(1)
using namespace std;
int table[1000]={0};
void ins(int n)
{
    table[n]=1;
}
void del(int n)
{
    table[n]=0;
}
bool sear(int n)
{
    if(table[n]==1)
        return true;
    else
        return false;
}
int main()
{

    while(true)
    {
    cout<<"1.Insert\n2.Search\n3.Del"<<endl;
    int ch, n;
    cin>>ch;
        switch(ch)
    {
        case 1:
            cout<<"Enter num";
            cin>>n;
            ins(n);
            cout<<"inserted\n";
            break;
        case 2:
            cout<<"Enter num";
            cin>>n;
            if(sear(n)==true)
            {
                cout<<"Present\n";
            }
            else{
                cout<<"not present\n";
            }
            break;
        case 3:
             cout<<"Enter num";
            cin>>n;
            del(n);
            break;


    }

    }
}
