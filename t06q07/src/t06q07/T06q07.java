/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t06q07;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Emertat
 */
public class T06q07 {

    /**
     * @param args the command line arguments
     */
    static int postIndex;

    public static void main(String[] args) {
        int in[] = { 4, 10, 12, 15, 18, 22, 24, 25,
                31, 35, 44, 50, 66, 70, 90 };
        int post[] = { 4, 12, 10, 18, 24, 22, 15, 31,
                44, 35, 66, 90, 70, 50, 25 };

        printPre(in, post);
    }

    private static void fill(int[] in, int[] post, int inStrt, int inEnd,
                 Stack<Integer> s, HashMap<Integer, Integer> hm)
    {
        if (inStrt > inEnd)
            return;

        int val = post[postIndex];
        int inIndex = hm.get(val);
        postIndex--;

        fill(in, post, inIndex + 1, inEnd, s, hm);

        fill(in, post, inStrt, inIndex - 1, s, hm);

        s.push(val);
    }

    private static void printPre(int[] in, int[] post)
    {
        int len = in.length;
        postIndex = len - 1;
        Stack<Integer> s = new Stack<>();

        HashMap<Integer, Integer> hm =
                new HashMap<>();
        for (int i = 0; i < in.length; i++)
            hm.put(in[i], i);

        fill(in, post, 0, len - 1, s, hm);

        while (!s.empty())
            System.out.print(s.pop() + " ");
    }

}

    

