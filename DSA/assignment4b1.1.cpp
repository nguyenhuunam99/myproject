#include <iostream>
using namespace std;
int hashfunction(int a)
{
    return (2*a+5)%11;
}
int main()
{
    int arrresult[11][11];
    for(int i=0;i<11;i++)
    {
        for(int j=0;j<11;j++) arrresult[i][j]=-1;
    }
    int arrdata[11]={12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
    for(int i=0;i<11;i++)
    {
        int pos = hashfunction(arrdata[i]);
        int j=0;
        while(arrresult[pos][j]!=-1)
        {
            j++;
        }
        arrresult[pos][j]=arrdata[i];
    }
    for(int i=0;i<11;i++)
    {
        cout<<i<<" ";
        for(int j=0;j<11;j++)
        {
            if(arrresult[i][j]!=-1) cout<<arrresult[i][j]<<" ";
        }
        cout<<endl;
    }
}

