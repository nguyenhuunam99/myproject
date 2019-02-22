#include<iostream>
using namespace std;

int shortestPath(int n,int a[],int x,int y,int count){
    if(x==y){
        cout<<min(count,shortestPath(n,a,x+1,y,count-1))<<endl;
        return count;
    }
    for(int i=x;i<n;i++){
            cout<<x<<" "<<i<<" "<<a[n*i+x-1]<<" "<<n*i+i<<" "<<n*i+x-1<<endl;
        if(a[n*i+x-1]==1){
            shortestPath(n,a,i+1,y,count-1);
        }
    }

}

int main(){
    int n;cin>>n;
    int map[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            map[i][j]=0;
        }
    }
    int m;cin>>m;
    int x,y;
    cin>>x>>y;
    int head,tail;
    for(int i=0;i<m;i++){
        cin>>head>>tail;
        map[head-1][tail-1]=1;
        map[tail-1][head-1]=1;
    }

    int *a=&map[0][0];
    cout<<shortestPath(n,a,x,y,0);
}
