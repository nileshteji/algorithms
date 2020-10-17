#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

class Freq
{
public:
 char a;
 int freq;

};

bool sortByFreq(Freq f1,Freq f2)
{
    return f1.freq>f2.freq;

}
int main()
{

    Freq arr2[26];
    int arr[26]={0};

    string str;
    getline(cin,str);
    for(int i=0;i<str.size();i++)
    {
        arr[str[i]-97]++;
    }
    for(int i=0;i<26;i++)
    {
        arr2[i].a=i+97;
        arr2[i].freq=arr[i];

    }

    //Sort by freq
    sort(arr2,arr2+26,sortByFreq);
    for(int i=0;i<3;i++)
    {
        cout<<arr2[i].a<<" :"<<arr2[i].freq;
    }

}
