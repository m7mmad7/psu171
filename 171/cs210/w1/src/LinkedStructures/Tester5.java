package LinkedStructures;

// Basit Qureshi Sep 20, 2017 8:37:03 AM
// Using a loop and temporay reference to scroll through Linked Structure 
public class Tester5
{
    public static void main(String [] s)
    {
        Node k1 = new Node(10);
        k1.next = new Node(20);
        k1.next.next = new Node(30);
        
        //Temp Node
        Node temp = k1;
        
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
        
        
    }
}
