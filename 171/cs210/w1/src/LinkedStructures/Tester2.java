package LinkedStructures;

// Basit Qureshi Sep 20, 2017 8:37:03 AM

import Nodes.Node;

// Using pointers / references to connect 3 nodes 
public class Tester2
{
    public static void main(String [] s)
    {
        Node k1 = new Node(10);
        k1.next = new Node(20);
        
        System.out.println(k1.val);
        System.out.println(k1.next.val);
        
        
        
    }
}
