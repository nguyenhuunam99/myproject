#include <iostream>
using namespace std;
bool findSum(int set[], int n, int sum) 
{ 
   if (sum == 0) 
    return true; 
   if (n == 0 && sum != 0) 
    return false; 
  
   if (set[n-1] > sum) 
    return findSum(set, n-1, sum); 
    return findSum(set, n-1, sum) || findSum(set, n-1, sum-set[n-1]); 
} 
int main()
{
	int size,sum;cin>>size>>sum;
	int arr[size];
	for(int i=0;i<size;i++) cin>>arr[i];
	if(findSum(arr,size,sum)) cout<<"Yes";
	else cout<<"No";
}
