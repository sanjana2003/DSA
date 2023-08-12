/*Implementation of binary search tree
Write a program to implement binary search tree.
Input Format:

The input should be numbers (until user enters a negative value)



Output Format:

The output should be numbers in the list.



Sample Input:

6

3

2

1

4

7

8

9

10

-1



Sample Output:

Tree values are:

1 2 3 4 6 7 8 9 10

Case 1
Case 2
Input (stdin)
6
3
2
1
4
7
8
9
10
-1

Output (stdout)
Tree values are:
1 2 3 4 6 7 8 9 10*/

import java.util.Scanner;
class Node{
  int key;
  Node left,right;
  public Node(int item){
    key = item;
    left = right = null;
  }
}

class BinarySearchTree{
  Node root;
  BinarySearchTree(){
    root = null;
  }

  void insert(int key){
    root = InsertRec(root,key);
  }
 
  Node InsertRec(Node root,int key){
    if(root == null){
      root = new Node(key);
      return root;
    }
    if(key < root.key)
      root.left = InsertRec(root.left,key);
    else if(key > root.key)
      root.right = InsertRec(root.right,key);
  return root;
}
 
void InorderTraversal(Node root){
  if(root != null){
    InorderTraversal(root.left);
    System.out.print(root.key+" ");
    InorderTraversal(root.right);
  }
}
}
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    BinarySearchTree bst = new BinarySearchTree();
    while(true){
      int num = scanner.nextInt();
      if(num < 0)
        break;
      bst.insert(num);
     }
    System.out.println("Tree values are:");
    bst.InorderTraversal(bst.root);
}
}
