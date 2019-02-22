#include <iostream>
using namespace std;

void quickSort(int arr[], int l , int r)
{
	if (l <= r)
	{
		int key = arr[(l+r)/2];
 
		int i = l;
		int j = r;
 
		while (i <= j)
		{
			while (arr[i] < key)
				i++;
			while (arr[j] > key)
				j--;
 
			if (i <= j)
			{
				swap(arr[i], arr[j]);
				i++;
				j--;
			}
		}
		if (l < j)
			quickSort(arr, l, j);
		if (r > i)
			quickSort(arr, i, r);
	}
}
int main()
{
	int n;cin>>n;
	int a[n];
	for(int i=0;i<n;i++) cin>>a[i];
	quickSort(a,0,n-1);
	for(int i=0;i<n;i++) cout<<a[i]<<" ";
}
