#include<iostream>

using namespace std;

int main(){
    int numCity, numPath, head, tail;
    cin>>numCity>>numPath>>head>>tail;
    int map[numCity][numCity];
    int vertexBefore[numCity][numCity];
    //kh?i t?o map và b?n d? du?ng di
    for(int i=0;i<numCity;i++){
        for(int j=0;j<numCity;j++){
            vertexBefore[i][j]=-1;
            if(i==j)
                map[i][j]=0;
            else
                map[i][j]=1000;
        }
    }
    //nh?p d? li?u
    int first,last,space;
    int path[numPath][3];
    for(int i=0;i<numPath;i++){
        cin>>first>>last>>space;
        path[i][0]=first-1;
        path[i][1]=last-1;
        path[i][2]=space;
    }
    //duy?t các d?nh
    for(int k=0;k<numCity;k++){
        for(int i=0;i<numPath;i++){
            for(int j=0;j<numPath;j++){
                first=path[j][0];
                last=path[j][1];
                space=path[j][2];
                int firstLength=map[k][first];
                int lastLength=map[k][last];
                if(lastLength>firstLength+space&&firstLength<500){
                    map[k][last]=firstLength+space;
                    vertexBefore[k][last]=first;
                }
            }
        }
    }
    cout<<map[head-1][tail-1]<<endl;
    //in ra du?ng di ng?n nh?t
    string a="";
    for(int way=tail;;){
            a=(char)(way+48)+a;
            way=vertexBefore[head-1][way-1]+1;
            if(way==0){
                for(int i=0;i<a.length();i++){
                    cout<<a[i]<<" ";
                }
                cout<<endl;
                break;
            }
    }
    //in ra b?n d? tr?ng s?
    for(int i=0;i<numCity;i++){
        for(int j=0;j<numCity;j++){
            cout<<map[i][j]<<" ";
        }
        cout<<endl;
    }
}
