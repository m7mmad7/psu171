package DLL;

// Basit Qureshi Oct 3, 2017 9:54:36 AM
//This class implements the Doubly Linked List 
public class DLL 
{
    public Node Head;
    public Node Tail;
    public int size;
    
    //constructor
    public DLL()
    {
        Head = Tail = null;
        size=0;
    }
    public void insert(Node N)
    {
        //check if list is empty
        if(Head == null)
        {
            Head = Tail = N;
            N.next = N.prev = null; // just to be careful!
            size++;
            return;
        }
        
        //by default, insert in the begining
        N.next = Head;
        Head.prev = N;
        Head = N;
        size++;
        return;
    }
    
    //search for a node containing id
    public Node search(int id)
    {
        Node temp = Head;
        if(temp==null)
            return null; //list is empty
        
        //look for a node with temp.id == id
        while(temp!=null)
        {
            if(temp.id==id)
                return temp;
            temp = temp.next;
        }
        return null;// not found
    }
    
    //find a node containing id and remove it!
    public boolean remove(int id)
    {
        Node temp = search(id);
        if(temp==null)
            return false;///not found!
        //check if temp is the head
        if(temp==Head)
        {
            //we need to remove and re-adjust the head;
            temp.next.prev = null;
            Head = temp.next;
        }
        // check if temp is the Tail
        else if(temp==Tail)
        {
            //we need to remove the re-adjust the tail;
            temp.prev.next = null;
            Tail = temp.prev;
        }
        //otherwise temp is in the middle!!!
        else
        {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
        return true;        
        
    }
    public boolean update(int id_old, int id_new)
    {
        Node temp = search(id_old);
        if(temp==null)//not found!
            return false;
        temp.id = id_new;
        return true;
    }
    
    public String toString()
    {
        Node temp = Head;
        String data="";
        while(temp!=null)
        {
            data = data + " " + temp.id;
            temp = temp.next;
        }
        return data;
    }
    
}
