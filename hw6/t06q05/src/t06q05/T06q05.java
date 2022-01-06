/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q05;

/**
 *
 * @author Emertat
 */
public class T06q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
   try{
            BinarySearchTree bst = new BinarySearchTree();

            bst.addNormal(14);
            bst.addNormal(9);
            bst.addNormal(10);
            bst.addNormal(63);
            bst.addNormal(7);
            bst.addNormal(25);
            
            
            bst.inOrderTraversal();
            bst.DMTA(10);
            System.out.println("\n");
            bst.inOrderTraversal();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    }
    

