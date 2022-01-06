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
public class T06q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BinarySearchTree t= new BinarySearchTree();
        t.addNormal(14);
        t.addNormal(9);
        t.addNormal(63);
        t.addNormal(7);
        t.addNormal(10);
        System.out.println(t.question2());
        
        
    }
    
}
