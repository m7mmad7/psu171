package CList;

// Basit Qureshi Feb 15, 2017 2:07:57 PM
 
public class Node 
{
    public int ID;
    public Node next;
    
    public Node()
    {
        ID = 0;
        next = null;
    }
    public Node(int ID)
    {
        this.ID=ID;
        next = null;
    }
}
