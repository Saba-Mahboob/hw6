/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q08;
import java.util.*;
import static t06q08.HeapSort.printArray;



/**
 *
 * @author Emertat
 */
public class T06q08 {   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        HeapSort h=new HeapSort();
        Random r=new Random();
        int arr[]=new int [6] ;//= { 12, 11, 13, 5, 6, 7 };
       for(int i=0;i<6;i++){
           int a=input.nextInt();
         arr[i]=a;
         
       }
        int n = arr.length;
        h.sort(arr);
        printArray(arr);
        
      
        
    }
}

