#include <iostream>
using namespace std;
int main()
{
	int n;cin>>n;
	char arr[n];
	for(int i=0;i<n;i++)
	{
		arr[i]='0';
	}
	for(int i=n-1;i>=0;i--)
	{
		if(arr[i]=='0')
		{
			arr[i]='1';
			for(int j=i+1;j<n;j++)
			{
				arr[j]='0';
			}
			for(int j=0;j<n;j++)
			{
				cout<<arr[j];
			}
			cout<<endl;
			i=n;
			
		}
	}
}
