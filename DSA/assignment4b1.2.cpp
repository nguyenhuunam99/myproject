#include <iostream>
using namespace std;
int hashfunction(int a)
{
	return (2*a+5)%11;
}
int main()
{
	int arrdata[11] = {12, 44, 13, 88, 23, 94, 11, 39, 20, 16, 5};
	int arrresult[11]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	for(int i=0;i<11;i++)
	{
		int pos=hashfunction(arrdata[i]);
		int j=pos;
		while(arrresult[j]!=-1)
		{
			j++;
			j=j%11;
		}
		arrresult[j] = arrdata[i];
	}
	for(int i=0;i<11;i++) cout<<arrresult[i]<<" ";
}

