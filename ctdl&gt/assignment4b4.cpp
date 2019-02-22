#include <iostream>
using namespace std;
class Node
{
	public:
	Node *next=NULL;
	int Id;
	string Name;
	string Class;
	Node (int a,string b,string c)
	{
		Id=a;
		Name=b;
		Class=c;
	}
};
class List
{
	public:
	Node *head=NULL;
	void insert(int a,string b,string c)
	{
		Node *newNode=new Node(a,b,c);
		if(head==NULL) head=newNode;
		else
		{
			Node *tmp=head;
			while(tmp->next!=NULL)
			{
				tmp=tmp->next;
			}
			tmp->next=newNode;
		}
	}
	void print()
	{
		Node *tmp=head;
		while(tmp!=NULL)
		{
			cout<<tmp->Name<<" "<<tmp->Class<<endl;
			tmp=tmp->next;
		}
	}
	void deleteid(int a)
	{
		Node *tmp=head;
		while(tmp->Id!=a)
		{
			tmp=tmp->next;
		}
		tmp->Name="NA";
		tmp->Class="NA";
	}
	int size()
	{
		int count=0;
		Node *temp=head;
		while(temp!=NULL)
		{
			count++;
			temp=temp->next;
		}
		return count;
	}
	void infor(int a)
	{
		if(a>size())
		{
			cout<<"NA,NA"<<endl;
		}
		else
		{
			Node *tmp=head;
			while(tmp->Id!=a)
			{
				tmp=tmp->next;
			}
			cout<<tmp->Name<<","<<tmp->Class<<endl;
		}
	}
};
int main()
{
	List l;
	l.insert(1,"Tuan","K62CS");
	l.insert(2,"hoang","asd");
//	l.insert(3,"hau","asdfas");
//	l.deleteid(3);
	l.infor(3);
    l.infor(2);
    l.deleteid(2);
    l.infor(2);
}

