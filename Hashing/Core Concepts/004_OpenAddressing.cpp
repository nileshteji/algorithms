#include<iostream>
#include<list>
using namespace std;

class OpenAddress
{
    public:
    int *arr;
    int cap,siz;
    OpenAddress(int cap)
    {
        this->cap=cap;
        arr=new int[cap];
        siz=0;
        for(int i=0;i<cap;i++)
        {
            arr[i]=-1;//-1 shows empty
        }

    }

    int hashKey(int key)
    {
        return key%cap;

    }
    bool searchKey(int key)
    {
        int i=hashKey(key);
        int j=i; //Circular
        while(arr[i]!=-1 ) //
        {
            if(arr[i]==key)
            {
                 return true;

            }


            i=(i+1)%cap;
            if(i==j)
                return false;

        }
        return false;



    }
    void insertKey(int key)
    {

        int i=hashKey(key);
        while(i<cap)
        {
            if(arr[i]==-1 || arr[i]==-2)
            {
                arr[i]=key;
                return;
            }


            i=(i+1)%cap;

        }

    }
    void deleteKey(int key)
    {
        int i=hashKey(key);
        int j=i; //Circular
        while(arr[i]!=-1 ) //
        {
            if(arr[i]==key)
            {
                 arr[i]=-2;

            }


            i=(i+1)%cap;
            if(i==j)
                return ;

        }
        return ;


    }

    void display()
    {
        for(int i=0;i<cap;i++)
        {
            cout<<arr[i]<<endl;
        }

    }

};
int main()
{
    OpenAddress o1(3);
    o1.insertKey(45);
     o1.insertKey(21);
    o1.insertKey(46);

    o1.display();

    bool flag= o1.searchKey(21);

    if(flag==true)
        cout<<"find\n";

    if(flag==false)
    {
        cout<<"not\n";
    }

    o1.deleteKey(21);
    o1.deleteKey(22);
    o1.display();
    flag= o1.searchKey(21);

    if(flag==true)
        cout<<"find\n";

    if(flag==false)
    {
        cout<<"not\n";
    }


}
