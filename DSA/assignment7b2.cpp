#include <iostream>
using namespace std;
int a[3][5]={{-1,-1,-1,-1,2},
			 {-1,2,-2,1,3},
			 {2,-1,-1,-1,-1}};
int tongphantu(int th,int tc,int dh,int dc)
{
	int tong=0;
	for(int i=th;i<=dh;i++)
	{
		for(int j=tc;j<=dc;j++)
		{
			tong+=a[i][j];
		}
	}
	return tong;
}
int main()
{
	int tong = INT_MIN;
	int th=0;
	int tc=0;
	int dh=1;
	int dc=1;
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<4;j++)
		{
			for(int k=i+1;k<3;k++)
			{
				for(int l=j+1;l<5;l++)
				{
					if(tongphantu(i,j,k,l)>tong)
					{
						tong=tongphantu(i,j,k,l);
						th=i+1;
						tc=j+1;
						dh=k+1;
						dc=l+1;
					}
				}
			}
		}
	}
	cout<<th<<" "<<tc<<" "<<dh<<" "<<dc<<" "<<tong;
}
