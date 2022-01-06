/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q02;

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
   
    

  
    
    public int question2()
    {
        return question2Recursive(root);
    }
    private int question2Recursive(Node n)
    {
        if(n == null)
            return 0;
        
        if(n.left != null && n.right == null)
            return 1+question2Recursive(n.left);
        else if(n.left == null && n.right != null)
            return 1+question2Recursive(n.right);
        else if(n.left != null && n.right != null)
            return 1+question2Recursive(n.left)+question2Recursive(n.right);
        else
            return 0;
    }
     
    
   
    
    
}
