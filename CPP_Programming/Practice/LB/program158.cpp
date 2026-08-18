#include<iostream>
using namespace std;

#pragma pack(1)
class ArrayX
{
    public:
        int *Arr;
        int iSize;

        // Parameterized Constructor
        ArrayX(int X)
        {
            cout<<"Inside Constructor\n";
            iSize = X;                  // Characteristics initialization
            Arr = new int[iSize];       // Resource Allocation
        }

        // Destructor
        ~ArrayX()
        {
            cout<<"Inside Destructor\n";
            delete []Arr;               // Resource De-allocation
        }

};

int main()
{
    ArrayX aobj1(5);    
    
    return 0;
}