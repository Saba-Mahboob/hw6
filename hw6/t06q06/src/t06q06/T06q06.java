/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t06q06;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Emertat
 */
public class T06q06 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        BinarySearchTree t= new BinarySearchTree();
        Random r=new Random();
        for(int i=0;i<5;i++){
            int a=input.nextInt();
            t.addNormal(a);
            
        }
        t.inOrderTraversal();
        while(t.root!=null){
            System.out.println("\t");
            int b=input.nextInt();
            t.delete(b);
            t.inOrderTraversal(); 
        }
        
       // t.delete(64);
       // t.delete(80);
        
    }
    
}
