#include<iostream>
#include<list>
using namespace std;

class LinearProb
{
    public:
    int BUCKET;
    list<int> *table;

    LinearProb(int BUCKET)
    {
        this->BUCKET=BUCKET;
        table=new list<int>[BUCKET];
    }

    void insertKey(int key)
    {


    }
};
