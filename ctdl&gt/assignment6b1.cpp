#include <iostream> 
using namespace std; 
  
struct Node { 
    int key; 
    Node *left, *right; 
}; 

Node* newNode(int value) 
{ 
    Node* temp = new Node; 
    temp->key = value; 
    temp->left = temp->right = NULL; 
    return temp; 
} 
   
void inorder(Node* root) 
{ 
    if (root != NULL) { 
        inorder(root->left); 
        cout<<root->key<<" ";
        inorder(root->right); 
    } 
} 
  
Node* insert(Node* node, int value) 
{ 
    if (node == NULL) 
        return newNode(value); 
  
    if (value < node->key) 
        node->left = insert(node->left, value); 
    else
        node->right = insert(node->right, value); 
    return node; 
} 
  
Node* deleteNode(Node* root, int k) 
{ 
    if (root == NULL) 
        return root; 
  
    if (root->key > k) { 
        root->left = deleteNode(root->left, k); 
        return root; 
    } 
    else if (root->key < k) { 
        root->right = deleteNode(root->right, k); 
        return root; 
    } 
    
    if (root->left == NULL) { 
        Node* temp = root->right; 
        delete root; 
        return temp; 
    } 
    else if (root->right == NULL) { 
        Node* temp = root->left; 
        delete root; 
        return temp; 
    } 
  
    else { 
  
        Node* temp1 = root->right; 
          
        Node *temp2 = root->right; 
        while (temp2->left != NULL) { 
            temp1 = temp2; 
            temp2 = temp2->left; 
        } 
  
        temp1->left = temp2->right;
        root->key = temp2->key; 
        delete temp2;          
        return root; 
    } 
} 
  
int main() 
{ 
    Node* root = NULL; 
    root = insert(root, 2); 
    root = insert(root, 1); 
    root = insert(root, 10); 
    root = insert(root, 6); 
    root = insert(root, 3); 
    root = insert(root, 8); 
    root = insert(root, 7); 
  	root = insert(root, 13);
  	root = insert(root, 20);
  	root = insert(root, 14);
  	root = insert(root, 0);
  	root = insert(root, 35);
    cout<<"before delete \n"; 
    inorder(root);  
    root = deleteNode(root, 6);
    root = deleteNode(root,13);
    root = deleteNode(root, 35);
    cout<<endl;
    cout<<"after delete \n"; 
    inorder(root); 
    return 0; 
} 
