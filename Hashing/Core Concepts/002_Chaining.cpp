// CPP program to implement hashing with chaining
#include<iostream>
#include <list>
using namespace std;

class Hash
{
	int BUCKET; // No of buckets
	list<int> *table ; //Represents a hash table
	public:
	Hash(int BUCKET)
	{
        this->BUCKET=BUCKET;
        table =new list<int> [BUCKET] ;
	}
	int hashFunction(int key)
	{
        return key%BUCKET;
	}
	void insertKey(int key)
	{
        int index=hashFunction(key);
        table[index].push_back(key);
	}
	void display()
	{for (int i = 0; i < BUCKET; i++) {
    cout << i;
    for (int x : table[i])
      cout << " --> " << x;
    cout << endl;
    }
	}

void deleteItem(int key)
{
  // get the hash index of key
  int index = hashFunction(key);

  // find the key in (inex)th list
 /* list <int> :: iterator i;
  for (i = table[index].begin();
           i != table[index].end(); i++) {
    if (*i == key)
      break;
  }

  // if key is found in hash table, remove it
  if (i != table[index].end())
    table[index].erase(i);

*/

    table[index].remove(key);
}


};
int main()
{
    int arr[]={3,4,5,9,7,4,55,6,2,3,7,8,9};
    int siz=sizeof(arr)/sizeof(arr[0]);
    Hash h(5);
    for(int i=0;i<siz;i++)
    {
        h.insertKey(arr[i]);
    }
    h.display();
    cout<<"\nAfter deleting...\n"<<endl;
    h.deleteItem(5);
    h.deleteItem(6);
    h.display();

}

