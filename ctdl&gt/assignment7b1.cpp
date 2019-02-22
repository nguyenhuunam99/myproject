#include <iostream>
#include <fstream>
using namespace std;
int main()
{
	ifstream fileInput;
	fileInput.open("C:/Users/Admin/Desktop/data.txt");
	int arr[100];
	int size=0;
	int temp=0;
	while(fileInput>>temp)
	{
		arr[size]=temp;
		size++;
	}
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(arr[i]>arr[j])
			{
				int n = arr[i];
				arr[i]=arr[j];
				arr[j]=n;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		cout<<arr[i]<<" ";
	}
	fileInput.close();
}
