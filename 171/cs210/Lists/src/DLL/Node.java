package DLL;

// Basit Qureshi Oct 3, 2017 9:52:06 AM
 
public class Node 
{
    public int id;
    public Node next;
    public Node prev;
    public Node()
    {
        id = 0;
        next = prev = null;
    }
    public Node(int id)
    {
        this.id = id;
        next = prev = null;
    }
}
