package LinkedStructures;

// Basit Qureshi Sep 20, 2017 8:37:03 AM

import Nodes.Node;

// Using a loop and temporay reference to built a Linked Structure 
public class Tester6
{
    public static void main(String [] s)
    {
        int SIZE = 10;
        
        Node Head = new Node(1);
        Node temp = Head;

        for(int i=1; i < SIZE; i++)
        {
            temp.next = new Node(i+1);
            temp = temp.next;
        }
        //Head points to the first node in the chain
        //Its important not to loose the head reference
        
        //Lets see what was created using Head.
        //Again work with a temp reference
        temp = Head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
        
        
    }
}
