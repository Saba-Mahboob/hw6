/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q06;

/**
 *
 * @author Emertat
 */
public class BinarySearchTree {

    Node root;
      public BinarySearchTree()
    {
        this.root = null;
    }
    
    public void addNormal(int value) throws Exception
    {
        Node temp, ptr;
        temp = new Node(value);
        if(root == null){
            root = temp;
            return;
        }
        else
        {
            ptr = root;
            while(ptr != null)
            {
                if(ptr.key > value) // left
                {
                    if(ptr.left!=null)
                        ptr = ptr.left;
                    else
                    {
                        ptr.left = temp;
                        break;
                    }
                }
                else if(ptr.key < value) // right
                {
                    if(ptr.right == null)
                    {
                        ptr.right = temp;
                        break;
                    }
                    else
                        ptr = ptr.right;
                }
                else
                    throw new Exception("Repeated value");
            }
        }
    }
  
    public void inOrderTraversal()
    {
        inOrderRecursive(root);
    }
    private void inOrderRecursive(Node n)
    {
        if(n == null)
            return;
        inOrderRecursive(n.left);
        System.out.print(n.key +"\t");
        inOrderRecursive(n.right);
    }
  
    public void delete(int val)
    {
        deleteRecursive(root, val);
    }
    private Node deleteRecursive(Node n, int value)
    {
        if(n == null)
            return null;
        
        if(value < n.key)//left
            n.left = deleteRecursive(n.left, value);
        else if(value > n.key) // right
            n.right = deleteRecursive(n.right, value);
        else
        {
            if(n.left == null || n.right == null)
            {
                Node temp = n.left !=null ? n.left : n.right;
                if(temp == null)
                    return null;
                else
                    return temp;
            }
            else//n has left and right
            {
                Node temp = helper(n);
                
                n.key = temp.key;
                n.right = deleteRecursive(n.right, n.key);
                return n;
            }
        }
        
        return n;
    }
    private Node helper(Node n)
    {
        if(n == null)
            return null;
        
        Node temp = n.right;
        while(temp.left != null)
            temp = temp.left;
        return temp;
    }
}
    

     
   