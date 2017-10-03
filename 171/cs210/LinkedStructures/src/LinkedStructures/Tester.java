package LinkedStructures;

// Basit Qureshi Sep 20, 2017 8:37:03 AM

import Nodes.Node;

// Creating a Linked Structure 
public class Tester 
{
    public static void main(String [] s)
    {
        Node k1 = new Node();
        k1.val = 10;
        
        Node k2 = new Node(20);
        
        Node k3 = k2;
        
        System.out.println(k1.val);
        System.out.println(k2.val);
        System.out.println(k3.val);
        
    }
}
