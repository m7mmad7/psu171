package LinkedStructures;

// Basit Qureshi Sep 20, 2017 8:37:03 AM
// Using a temporay reference to scroll through Linked Structure 
public class Tester4
{
    public static void main(String [] s)
    {
        Node k1 = new Node(10);
        k1.next = new Node(20);
        k1.next.next = new Node(30);
        
        //Temp Node
        Node temp = k1;
        
        System.out.println(temp.val);
        
        //moving Temp to next node in the chain
        temp = temp.next;
        
        System.out.println(temp.val);
        
        temp = temp.next;
        
        System.out.println(temp.val);
        
        
    }
}
