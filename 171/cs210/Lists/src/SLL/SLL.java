package SLL;

// Basit Qureshi Sep 27, 2017 11:07:13 AM
// this implements Singly Linked List 
public class SLL 
{
    public Node Head;
    public int size;
    
//Constructor
    public SLL()
    {
        Head = null;
        size = 0;
    }

//Search a key.. returns first node found containing the key    
    public Node Search(int key)
    {
        Node temp = Head;
        while(temp!=null)
        {
            if(temp.val==key)
                break;
            temp = temp.next;
        }
        return temp;
    }
//Add a node to the list
    public void insert(Node N)
    {
        //check if list is empty
        if(Head==null)
        {
            Head = N;
            N.next = null;
            size++;
            return;
        }
        
        //add the new node N to the head of the list
        N.next = Head;
        Head = N;
        size++;
        return;
    }
    
//remove a node from the list; we first search the node containing the key
//3 cases would apply. begining, middle or the end.
    public boolean remove(int key)
    {
        //we return true if node containing key is sucessfully removed; false otherwise
        boolean RETURN = false;
        //check if list is empty
        if(Head == null)
            return RETURN;
        //check if list has only one node
        if(size==1)
        {
            //check if this node is the candidate
            if(Head.val == key)
            {
                Head = null;
                size--;
                RETURN = true;
            }
            return RETURN;
        }
        
        //now we have atleast 2 nodes in the list
        //look for the candidate
        //remember the previous node;
        
        Node temp=Head, P=null, N;
        while(temp!=null)
        {
            if(temp.val==key) // found it!
                break;
            
            P=temp;
            temp = temp.next;
        }
        
        if(temp==null)// didn't find it
            return false;
        

        //case 1. if Head is the candidate node
        if(temp==Head)
        {
            Head = temp.next;
            
        }
        
        //case 2. if candidate is in the middle or the last!
        else 
        {
            P.next= temp.next;

        }
        size--;
        
        return true;
    }
    
//update method takes two params old and key 
    public boolean update(int old, int key)
    {
        if(Head == null)
            return false;
        
        Node temp = Head;
        while(temp!=null)
        {
            if(temp.val == old)
            {
                temp.val = key;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
//toString method
    public String toString()
    {
        String out = "";
        Node temp = Head;
        while(temp!=null)
        {
            out = out + " " + temp.val;
            temp = temp.next;
        }
        return out;
    }
    
}
