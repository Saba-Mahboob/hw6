/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q04;

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
   
    

  
    
    public int question4()
    {
        return question4Recursive(root,0);
    }
    private int question4Recursive(Node n,int k)
    {
        
        if(n == null){
            return -1;}
        
        if(n.left != null && n.right == null)
            return  question4Recursive(n.left,k);
        else if(n.left == null && n.right != null)
            return question4Recursive(n.right,k);
        else if(n.left != null && n.right != null)
           return question4Recursive(n.right,k)+ question4Recursive(n.left,k);
        else if(n.left == null && n.right == null)
            return k+1;
        else
            return k;
    }
     
    
   
    
    
}
