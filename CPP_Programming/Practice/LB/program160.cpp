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
    // Static memory allocation for object
    // ArrayX aobj(5);
    
    ArrayX *aobj1 = new ArrayX(5);

    delete aobj1;

    cout<<"End of main\n";
    
    return 0;
}